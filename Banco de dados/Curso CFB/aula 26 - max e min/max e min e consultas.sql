/*Maximo e minimo do valor de uma consulta*/
select max(venda.f_valor_venda) from venda;

/*Fazendo um sub select mais elaborado*/
select * from venda
where f_valor_venda = (select max(f_valor_venda) from venda);

/*Adicionando ainda mais filtros ---------------------*/
select 
	 c.s_nomecliente_cliente,
     tp.s_dsctipocliente_tipocliente,
     v.d_data_venda,
     v.f_valor_venda
from 
	venda as v
inner join cliente as c on c.i_cliente_cliente = v.i_cliente_venda
inner join tipocliente as tp on tp.i_tipocliente_tipocliente = c.i_tipocliente_cliente
where v.f_valor_venda = (select max(f_valor_venda) from venda);




select 
	c.s_nomecliente_cliente,
	v.f_valor_venda
from 
	venda as v
inner join cliente as c on c.i_cliente_cliente = v.i_cliente_venda
where v.f_valor_venda = (select max(f_valor_venda) from venda);

