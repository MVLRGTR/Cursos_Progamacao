/*
Select clausulas:
	from - mostrar aonde sera feito o select
	where - aplicar filtros
	group by - ageupar linha por meio de valores comum 
    heving - filtro de grupos indesejados
    order by - mostrar como os registros serão ordenados
*/

select * from cliente;

select s_nomecliente_cliente,s_cpf_cliente from cliente; /*Filtrando apenas duas colunas*/
select *,s_nomecliente_cliente,s_cpf_cliente from cliente; /*Mostrar todos os valores e ao final adiconar novamente as duas colunas*/

/*Fazendo operações junto ao select*/
select s_nomecliente_cliente,i_tipocliente_cliente * 2 from cliente;

/*Converte as letras de uma coluna para upper , podendo também usar varias outras funções como count() , not() e assim por diante*/
select i_cliente_cliente,upper(s_nomecliente_cliente),i_tipocliente_cliente  from cliente;


