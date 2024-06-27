/*No SQL serve utilizimos o comando 
SELECT TOP 5 * from cliente ; esse comando irá mostrar apenas os 5 primeiros registro dessa consulta 

No oracle utilizamos o comando
select * from cliente where ROWNUM < 5;
*/

/*Tem a mesma função do comando acima com a diferença entre as linguagem */
select * from cliente limit 5 ;

/*No comando abaixo e demostrado uma consulta aonde observo os 5 dias que mais cvenderam na loja'*/
select 
	v.d_data_venda,count(v.f_valor_venda) 
from 
	venda as v  
group by v.d_data_venda order by count(v.f_valor_venda) desc limit 5 ;

/*No comando abaixo  demostro uma consulta que me mostra os valores das 5 maiores vendas em valor */
select 
	v.d_data_venda,
	c.s_nomecliente_cliente,
    tp.s_dsctipocliente_tipocliente,
    v.f_valor_venda
from venda as v
	inner join cliente as c on v.i_cliente_venda = c.i_cliente_cliente
    inner join tipocliente as tp on tp.i_tipocliente_tipocliente = c.i_tipocliente_cliente
order by v.f_valor_venda desc limit 5;


