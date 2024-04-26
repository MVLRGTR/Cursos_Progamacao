/*O order by nada mais é que um ordenador de tabelas conforme a coluna criterio base informada*/
select 
	* 
from 
	cliente
order by 
	s_nomecliente_cliente;
    
/*Além disso posso estabelecer duas colunas para as ordenações como será mostrado abaixo , sendo aplicado o primeiro criterio e depois o outro*/
/*No select abaixo ordeno primeiro por tipo de cliente e dentro desse subgrupo ordeno por orden alfabetica*/
select 
	* 
from 
	cliente
order by 
	i_tipocliente_cliente,s_nomecliente_cliente;

/*Além disso posso fazer a ordenação pelo número da coluna */
/*Temos o mesmo select escrito acima diferindi apenas a forma descrita*/
select 
	* 
from 
	cliente
order by 
	5,2;

/*Ordenação por ordem descendente*/
select 
	* 
from 
	cliente
order by 
	2 desc;
    
/*Ordenando pelo 3 ultimos digito do cpf */
select 
	* 
from 
	cliente
order by 
	right(s_cpf_cliente,3);
    
    
    