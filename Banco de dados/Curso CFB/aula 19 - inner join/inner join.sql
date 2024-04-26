select * from cliente;
select * from tipocliente;

/*No inner join abaixo fizemos a correlação entre as duas tabelas e retornando uma consulta com o tipo de cliente descrito na ultima coluna*/
select 
	c.i_cliente_cliente ,
    c.s_nomecliente_cliente,
    c.s_cpf_cliente,
    c.d_datanascim_cliente,
    tc.s_dsctipocliente_tipocliente as 'tipo cliente'
from cliente as c
	inner join tipocliente as tc on c.i_tipocliente_cliente = tc.i_tipocliente_tipocliente;
    

/*Aqui temos a junção da tabela venda e cliente aonde eu mostro o nome do cliente */
select * from venda;
select
	v.i_venda_venda,
    c.s_nomecliente_cliente as 'Nome cliente',
    c.s_cpf_cliente as CPF,
    v.d_data_venda,
    v.f_valor_venda
from venda as v
	inner join cliente as c on v.i_cliente_venda = c.i_cliente_cliente;
    

/*NESSE TERCEIRO JOIN TENHO A ADIÇÃO DE MAIS UMA TABELA TOTALIZANDO TRES*/
select * from venda;
select
	v.i_venda_venda,
    c.s_nomecliente_cliente as 'Nome cliente',
    c.s_cpf_cliente as CPF,
    t.s_dsctipocliente_tipocliente as 'Tipo cliente',
    v.d_data_venda,
    v.f_valor_venda
from venda as v
	inner join cliente as c on v.i_cliente_venda = c.i_cliente_cliente
    inner join tipocliente as t on c.i_tipocliente_cliente= t.i_tipocliente_tipocliente;

