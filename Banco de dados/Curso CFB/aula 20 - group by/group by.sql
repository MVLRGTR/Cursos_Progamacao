select * from cliente;

/*Aqui faço uma consulta ordenando pelo tipo cliente e montando as colunas tipo e quantidade*/
select 
	i_tipocliente_cliente as 'Tipo do cliente',
    count(i_cliente_cliente) as 'Quantidade Cliente'
 from 
	cliente
group by i_tipocliente_cliente
;



/*O codigo igual ao de cima so que agora eu coloco um inner join para poder trazer a descrição do tipo cliente*/
select 
	tc.s_dsctipocliente_tipocliente as 'Tipo do cliente',
    count(c.i_cliente_cliente) as 'Quantidade Cliente'
 from 
	cliente as c
inner join tipocliente as tc on tc.i_tipocliente_tipocliente = c.i_tipocliente_cliente
group by i_tipocliente_cliente
;

/*Mostrando o funcionamento basico do group by*/
select 
	count(i_venda_venda) as 'Quantidade de vendas do dia',
	d_data_venda
from venda
group by d_data_venda;

