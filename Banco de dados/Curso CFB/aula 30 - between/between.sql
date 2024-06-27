/*O between serve para eu demostra na minha consulta faixa de valores*/
select * from cliente
where i_tipocliente_cliente between 1 and 2;

/*Consulta da aula anterior usando between*/
select * from cliente
where d_datanascim_cliente between '1990-01-01' and '2010-01-01';

/*Consulta between com duas condições*/
select * from cliente
where (d_datanascim_cliente between '1990-01-01' and '2010-01-01') and i_cliente_cliente not in (3,4,8,9,10);