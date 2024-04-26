/*O EXIST retorna para min a existencia de dados daquela consulta true or false*/

/*No comando abaixo verifico quais os clientes existem na tabela venda , ou seja quais realizaram compras*/
select * from cliente c
where exists (select * from venda as v where v.i_cliente_venda = c.i_cliente_cliente);

select * from venda order by i_cliente_venda;