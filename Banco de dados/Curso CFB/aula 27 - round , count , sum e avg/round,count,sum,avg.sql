/*
SUM = soma
AVG = media
CONUT = Contagem
ROUND = Arredondamento
*/

/*Somando todos os valores de venda e arredondando ao mesmo tempo*/
select round(sum(v.f_valor_venda),2) from venda as v
where d_data_venda > '2020-07-01';

/*A media das vendas*/
select round(avg(f_valor_venda),2) from venda;

/*Fazendo um filtro para ter a media das vendas eliminando a maior e menor venda*/
select 
	round(avg(f_valor_venda),2) 
from 
	venda
where f_valor_venda < (select max(f_valor_venda) from venda) and f_valor_venda > (select min(f_valor_venda) from venda);

/*Contando quantas vendas foram feita*/
select 
	round(avg(f_valor_venda),2) as 'Media Filtro',
    count(f_valor_venda) as 'Quantidade'
from 
	venda
where f_valor_venda < (select max(f_valor_venda) from venda) and f_valor_venda > (select min(f_valor_venda) from venda);


