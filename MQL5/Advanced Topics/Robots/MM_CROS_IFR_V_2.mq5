//+------------------------------------------------------------------+
//|                                               MM_CROS_IFR_V2.mq5 |
//|                                                  Copyright 2020. |
//|                                             https://www.mql5.com |
//+------------------------------------------------------------------+
#property copyright "rafaelfvcs. Copyright 2020."
#property link      "https://www.analistasquant.wordpress.com"
#property version   "1.00"
//---
#include <Trade/Trade.mqh>

//-------------------------------------------------------------------+
// Atenção: EA para fins APENAS didáticos!
// Isso aqui não confere orientação e/ou sugestão de investimentos!
// O autor não se responsabiliza pelo uso indevido deste material 
//-------------------------------------------------------------------+

enum ESTRATEGIA_ENTRADA
  {
   APENAS_MM,  // Apenas Médias Móveis
   APENAS_IFR, // Apenas IFR
   MM_E_IFR    // Médias mais IFR
  };

//---
// Variáveis Input
sinput string s0; //-----------Estratégia de Entrada-------------
input ESTRATEGIA_ENTRADA   estrategia      = APENAS_MM;     // Estratégia de Entrada Trader

sinput string s1; //-----------Médias Móveis-------------
input int mm_rapida_periodo                = 12;            // Periodo Média Rápida
input int mm_lenta_periodo                 = 32;            // Periodo Média Lenta
input ENUM_TIMEFRAMES mm_tempo_grafico     = PERIOD_CURRENT;// Tempo Gráfico
input ENUM_MA_METHOD  mm_metodo            = MODE_EMA;      // Método 
input ENUM_APPLIED_PRICE  mm_preco         = PRICE_CLOSE;   // Preço Aplicado

sinput string s2; //-----------IFR-------------
input int ifr_periodo                      = 5;             // Período IFR
input ENUM_TIMEFRAMES ifr_tempo_grafico    = PERIOD_CURRENT;// Tempo Gráfico  
input ENUM_APPLIED_PRICE ifr_preco         = PRICE_CLOSE;   // Preço Aplicado

input int ifr_sobrecompra                  = 70;            // Nível de Sobrecompra
input int ifr_sobrevenda                   = 30;            // Nível de Sobrevenda

sinput string s3; //---------------------------
input double num_lots                      = 100;           // Número de Lotes
input double TK                            = 60;            // Take Profit
input double SL                            = 30;            // Stop Loss
input double lucro_max_dia                 = 1000;          // Lucro máx diário
input double perda_max_dia                 = 500;           // Perda máx diária

sinput string s4; //---------------------------
input string hora_limite_fecha_op          = "17:40";       // Horário Limite Fechar Posição 



//+------------------------------------------------------------------+
//|  Variáveis para os indicadores                                   |
//+------------------------------------------------------------------+
//--- Médias Móveis
// RÁPIDA - menor período
int mm_rapida_Handle;      // Handle controlador da média móvel rápida
double mm_rapida_Buffer[]; // Buffer para armazenamento dos dados das médias

// LENTA - maior período
int mm_lenta_Handle;      // Handle controlador da média móvel lenta
double mm_lenta_Buffer[]; // Buffer para armazenamento dos dados das médias

//--- IFR
int ifr_Handle;           // Handle controlador para o IFR
double ifr_Buffer[];      // Buffer para armazenamento dos dados do IFR

//+------------------------------------------------------------------+
//| Variáveis para as funçoes                                        |
//+------------------------------------------------------------------+

int magic_number = 123456;   // Nº mágico do robô

MqlRates velas[];            // Variável para armazenar velas
MqlTick tick;                // variável para armazenar ticks 
//+------------------------------------------------------------------+
//|                                                                  |
//+------------------------------------------------------------------+
CTrade trade;

//+------------------------------------------------------------------+
//| Expert initialization function                                   |
//+------------------------------------------------------------------+
int OnInit()
  {
//---
   mm_rapida_Handle = iMA(_Symbol,mm_tempo_grafico,mm_rapida_periodo,0,mm_metodo,mm_preco);
   mm_lenta_Handle  = iMA(_Symbol,mm_tempo_grafico,mm_lenta_periodo,0,mm_metodo,mm_preco);
   
   ifr_Handle = iRSI(_Symbol,ifr_tempo_grafico,ifr_periodo,ifr_preco);
   
   if(mm_rapida_Handle<0 || mm_lenta_Handle<0 || ifr_Handle<0)
     {
      Alert("Erro ao tentar criar Handles para o indicador - erro: ",GetLastError(),"!");
      return(-1);
     }
   
   CopyRates(_Symbol,_Period,0,4,velas);
   ArraySetAsSeries(velas,true);
   
   // Para adicionar no gráfico o indicador:
   ChartIndicatorAdd(0,0,mm_rapida_Handle); 
   ChartIndicatorAdd(0,0,mm_lenta_Handle);
   ChartIndicatorAdd(0,1,ifr_Handle);
   //---
  
  
//---
   return(INIT_SUCCEEDED);
  }
//+------------------------------------------------------------------+
//| Expert deinitialization function                                 |
//+------------------------------------------------------------------+
void OnDeinit(const int reason)
  {
//---
   IndicatorRelease(mm_rapida_Handle);
   IndicatorRelease(mm_lenta_Handle);
   IndicatorRelease(ifr_Handle);
  }
//+------------------------------------------------------------------+
//| Expert tick function                                             |
//+------------------------------------------------------------------+


bool pode_operar = true;

void OnTick()
  {
//---
    // Copiar um vetor de dados tamanho três para o vetor mm_Buffer
    CopyBuffer(mm_rapida_Handle,0,0,4,mm_rapida_Buffer);
    CopyBuffer(mm_lenta_Handle,0,0,4,mm_lenta_Buffer);
    
    CopyBuffer(ifr_Handle,0,0,4,ifr_Buffer);
    
    //--- Alimentar Buffers das Velas com dados:
    CopyRates(_Symbol,_Period,0,4,velas);
    ArraySetAsSeries(velas,true);
    
    // Ordenar o vetor de dados:
    ArraySetAsSeries(mm_rapida_Buffer,true);
    ArraySetAsSeries(mm_lenta_Buffer,true);
    ArraySetAsSeries(ifr_Buffer,true);
    //---
    
    // Alimentar com dados variável de tick
    SymbolInfoTick(_Symbol,tick);
   
    // LOGICA PARA ATIVAR COMPRA 
    bool compra_mm_cros = mm_rapida_Buffer[0] > mm_lenta_Buffer[0] &&
                          mm_rapida_Buffer[2] < mm_lenta_Buffer[2] ;
                                             
    bool compra_ifr = ifr_Buffer[0] <= ifr_sobrevenda;
    
    // LÓGICA PARA ATIVAR VENDA
    bool venda_mm_cros = mm_lenta_Buffer[0] > mm_rapida_Buffer[0] &&
                         mm_lenta_Buffer[2] < mm_rapida_Buffer[2];
    
    bool venda_ifr = ifr_Buffer[0] >= ifr_sobrecompra;
    //---
    
    bool Comprar = false; // Pode comprar?
    bool Vender  = false; // Pode vender?
    
    if(estrategia == APENAS_MM)
      {
       Comprar = compra_mm_cros;
       Vender  = venda_mm_cros;
       
      }
    else if(estrategia == APENAS_IFR)
     {
        Comprar = compra_ifr;
        Vender  = venda_ifr;
     }
    else
      {
         Comprar = compra_mm_cros && compra_ifr;
         Vender  = venda_mm_cros && venda_ifr;
      }  
    
    // retorna true se tivermos uma nova vela
    bool temosNovaVela = TemosNovaVela(); 
    
    // Toda vez que existir uma nova vela entrar nesse 'if'
    if(temosNovaVela)
      {
       
       // Condição de Compra:
       if(Comprar && PositionSelect(_Symbol)==false && pode_operar)
         {
          desenhaLinhaVertical("Compra",velas[1].time,clrBlue);
          CompraAMercado();
         }
       
       // Condição de Venda:
       if(Vender && PositionSelect(_Symbol)==false && pode_operar)
         {
          desenhaLinhaVertical("Venda",velas[1].time,clrRed);
          VendaAMercado();
         } 
      //--

         Print("::: Lucro acumulado = ", LucroAcumulado() );
         
         
         if( LucroAcumulado() >= lucro_max_dia || LucroAcumulado() <= -perda_max_dia )
           {
            pode_operar = false;
           }
         
      }
      //---
      
      
      
      
      if(TimeToString(TimeCurrent(),TIME_MINUTES) == hora_limite_fecha_op && PositionSelect(_Symbol)==true)
        {
            Print("-----> Fim do Tempo Operacional: encerrar posições abertas!");
             
            
            
            FecharPosicao();
            pode_operar = true;
        /*    
            if(PositionGetInteger(POSITION_TYPE) == POSITION_TYPE_BUY)
               {
                  FechaCompra();
               }
            else if(PositionGetInteger(POSITION_TYPE) == POSITION_TYPE_SELL)
               {
                  FechaVenda();
               }
         */
        
        
        }

  }
//+------------------------------------------------------------------+
//+------------------------------------------------------------------+
//| FUNÇÕES PARA AUXILIAR NA VISUALIZAÇÃO DA ESTRATÉGIA              |
//+------------------------------------------------------------------+

void desenhaLinhaVertical(string nome, datetime dt, color cor = clrAliceBlue)
   {
      ObjectDelete(0,nome);
      ObjectCreate(0,nome,OBJ_VLINE,0,dt,0);
      ObjectSetInteger(0,nome,OBJPROP_COLOR,cor);
   } 
   
//+------------------------------------------------------------------+
//| FUNÇÕES PARA ENVIO DE ORDENS                                     |
//+------------------------------------------------------------------+

void CompraAMercado()
   {
   
      Print("::: NormalizeDouble(tick.ask - SL*_Point,_Digits) = ", NormalizeDouble(tick.ask - SL*_Point,_Digits));
      
      trade.Buy(num_lots,_Symbol,NormalizeDouble(tick.ask,_Digits),NormalizeDouble(tick.ask - SL*_Point,_Digits),
                NormalizeDouble(tick.ask + TK*_Point,_Digits));
      
      if(trade.ResultRetcode() == 10008 || trade.ResultRetcode() == 10009)
        {
            Print("Ordem de compra Executada com Sucesso!!");
        }else
           {
            Print("Erro de execução... ", GetLastError());
            ResetLastError();
           }          
     
   }
//---
void VendaAMercado()
   {
   
      
      Print("::: SL*_Point = ", SL*_Point, ",  _Point = ", _Point);
      
      Print("::: NormalizeDouble(tick.bid + SL*_Point,_Digits) = ", NormalizeDouble(tick.bid + SL*_Point,_Digits));
      
      
      trade.Sell(num_lots,_Symbol,NormalizeDouble(tick.bid,_Digits),NormalizeDouble(tick.bid + SL*_Point,_Digits),
                  NormalizeDouble(tick.bid - TK*_Point,_Digits));
      
      if(trade.ResultRetcode() == 10008 || trade.ResultRetcode() == 10009)
        {
            Print("Ordem de venda Executada com Sucesso!!");
        }else
           {
            Print("Erro de execução... ", GetLastError());
            ResetLastError();
           }              
   
   }
//---
void CompraLimite(double nivel_compra, double tp = 0.0, double sl = 0.0)
   {
      
      
      trade.BuyLimit(num_lots,nivel_compra,_Symbol,sl,tp); 
   
   
   }
//---
void VendaLimite(double nivel_venda, double tp = 0.0, double sl = 0.0)
   {
      
      
      trade.SellLimit(num_lots,nivel_venda,_Symbol,sl,tp); 
   
   
   }

//---

void FecharPosicao()
   {
   
      ulong ticket = PositionGetTicket(0);
      
      trade.PositionClose(ticket);
      
      if(trade.ResultRetcode() == 10009)
        {
            Print("Fechamento Executado com Sucesso!!");
        }else
           {
            Print("Erro de execução... ", GetLastError());
            ResetLastError();
           }  
   
   }


//+------------------------------------------------------------------+
//| FUNÇÕES ÚTEIS                                                    |
//+------------------------------------------------------------------+
double LucroAcumulado()
   {
      
      double lucro_acum = 0;
      double lucro = 0;
      
      HistorySelect(0,TimeCurrent());
      
      ulong tn = HistoryDealsTotal();
      
      //Print("Total de negócios = ", tn); 
      
      //Print("Negócio 2 Lucro = ", );
      
      for(int i=1;i<=tn;i++)
        {
            ulong tick_n = HistoryDealGetTicket(i);
            
            lucro = HistoryDealGetDouble(tick_n,DEAL_PROFIT);
            //Print("Negócio (",i, ") , Lucro = ",lucro );
            
            lucro_acum = lucro_acum + lucro; // lucro_acum += lucro
            
        }
   
      return lucro_acum;
   }




//--- Para Mudança de Candle
bool TemosNovaVela()
  {
//--- memoriza o tempo de abertura da ultima barra (vela) numa variável
   static datetime last_time=0;
//--- tempo atual
   datetime lastbar_time= (datetime) SeriesInfoInteger(Symbol(),Period(),SERIES_LASTBAR_DATE);

//--- se for a primeira chamada da função:
   if(last_time==0)
     {
      //--- atribuir valor temporal e sair
      last_time=lastbar_time;
      return(false);
     }

//--- se o tempo estiver diferente:
   if(last_time!=lastbar_time)
     {
      //--- memorizar esse tempo e retornar true
      last_time=lastbar_time;
      return(true);
     }
//--- se passarmos desta linha, então a barra não é nova; retornar false
   return(false);
  }
//---


