/*View serve para eu deixar consultas ao db prontas , e ao invés de fazer um select eu aciono a view*/
/*as tabelas da view não existem ficamente no db mas sim elas são apontamentos para as tabelas consultadas*/
select * from cliente;

create view cpfclientes as select i_cliente_cliente ,s_cpf_cliente from cliente;
select * from cpfclientes;

/*Criação de uma view para dizer os aniversariantes do mês --------------------------------------- */

select i_cliente_cliente, s_nomecliente_cliente,day(d_datanascim_cliente) as 'Dia Nascimento' from cliente; /*A função day retorna o dia de uma data*/
select i_cliente_cliente, s_nomecliente_cliente,day(d_datanascim_cliente) as 'Dia Nascimento' from cliente where month(d_datanascim_cliente)=month(curdate());

/*Criando uma view com os aniversariantes do mês----------------------------------------------------*/

create view 
aniversariodomes
as select i_cliente_cliente, s_nomecliente_cliente,day(d_datanascim_cliente) as 'Dia Nascimento' 
from cliente 
where month(d_datanascim_cliente)=month(curdate());

select * from aniversariodomes;