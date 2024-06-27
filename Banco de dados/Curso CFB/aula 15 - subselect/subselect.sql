select * from cliente_auxiliar;
select * from cliente;

insert into cliente_auxiliar 
	(s_nomecliente_cliente,s_cpf_cliente,d_datanascim_cliente,i_tipocliente_cliente) 
values ('Bruno Barros',12365214523,'1968-05-04',1);


select max(i_cliente_cliente) from cliente;/* Essa função me rotorna o valor maximo para essa consulta*/
select max(c.i_cliente_cliente) from cliente as c;

insert into cliente values ((select max(c.i_cliente_cliente) from cliente as c)+1,'Vespertino',12345678999,'1999-03-03',1);
insert into cliente values ((select max(c.i_cliente_cliente) from cliente as c)+1,'Paulo Lucas',12359634785,'1992-05-03',1);
/*No campo id do cliente eu primeiro faço um select e descubro qual a maior posição de cliente e depois adiciono  + 1*/

/*IMPORTANTE 
O MySQL, como outros bancos de dados relacionais, possui a regra de que uma tabela alvo de modificação (INSERT, UPDATE ou DELETE) não pode ser usada na cláusula FROM
 de uma subconsulta dentro da mesma instrução. Por isso sou obrigado a renomear a tabela cliente para c
*/


