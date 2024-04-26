/*Self join -unindo a tabela a ela mesma*/
/*Aqui eu faço dois alias para a mesma tabela e correlaciono com ele mesmo usando o criterio de tipo cliente */

select *
from 
	cliente  c1 , cliente  c2
where 
	c1.i_tipocliente_cliente = c2.i_tipocliente_cliente
order by c1.i_tipocliente_cliente;