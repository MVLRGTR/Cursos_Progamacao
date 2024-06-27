/*O having tem basicamente a função de filtrar os dados agrupados*/
select 
	count(i_cliente_cliente) as 'Quantidade de cliente',
	c.i_tipocliente_cliente as 'Tipo do cliente'
from cliente as c
group by c.i_tipocliente_cliente
having c.i_tipocliente_cliente > 1;

/*Having em outro exemplo -----------------------------------------*/
/*Seleciono apenas os dias que tiveream 2 ou mais vendas*/

select 
	v.d_data_venda as 'Data da venda',
    count(v.i_venda_venda) as 'Vendas no dia'
from venda as v
group by v.d_data_venda
having count(v.i_venda_venda) >= 2
;