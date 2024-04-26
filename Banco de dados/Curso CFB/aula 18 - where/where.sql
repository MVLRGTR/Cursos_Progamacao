/*O where nada mais é do que os filtros que são aplicados as consultas*/
select * from cliente;

select * from cliente 
where 	s_cpf_cliente = '00000000000' or
		s_cpf_cliente = '1111111111';
        
/*Filtro para os clientes são do tipo 1 e que nasceream depois do mês 5*/        
select * from cliente 
where 	i_tipocliente_cliente = 1 and month(d_datanascim_cliente) > 5 ;

/*Filtro para o tipo cliente 2 e 3 a nascido a partir do mes 3 com escalonamento*/ 
/*Poderia usar a expressao i_tipocliente_cliente != 1 na linha 15 */
select * from cliente 
where 	i_tipocliente_cliente in(2,3) and (month(d_datanascim_cliente)) > 3 ;

/*Outro filtro com mais parametros*/
select * from cliente 
where 	i_tipocliente_cliente in(2,3) and (month(d_datanascim_cliente)>=4 and month(d_datanascim_cliente) <=9 )  ;