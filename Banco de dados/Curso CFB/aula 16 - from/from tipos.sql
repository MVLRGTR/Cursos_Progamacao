select * from (select i_cliente_cliente ,s_nomecliente_cliente, s_cpf_cliente from cliente) as c;/*Aquui eu estou fazendo os aninhamentos de select onde armazeno uma outra tabela com nome c e aplico o select a ela*/
/*Isso me mostra que posso utilizar retorno de consultas para poder fazer outras consultas ou sub consultas*/

select c.i_cliente_cliente,c.s_nomecliente_cliente from (select i_cliente_cliente ,s_nomecliente_cliente, s_cpf_cliente from cliente) as c;

create view nomeclientes as select i_cliente_cliente ,s_nomecliente_cliente, s_cpf_cliente from cliente ;
select * from nomeclientes;
/*A view nada mais que um apontador para que eu não precise ficar toda hora fazendo consulta mas sim preestabelecendo ela em uma view e utilizando a mesma*/