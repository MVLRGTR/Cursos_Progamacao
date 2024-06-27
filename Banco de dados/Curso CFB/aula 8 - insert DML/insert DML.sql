/*DML - INSERT */
/* insert into <tbale> (colunas) values(valores)*/

insert into tipocliente values (01,'Pessoa Física');
insert into tipocliente values (02,'Pessoa Jurídica');
insert into tipocliente values (03,'Governamental');

insert into cliente values ((select max(c.i_cliente_cliente) from cliente as c)+1,'Jorlan','52314523654','1958-07-07',01);
insert into cliente values ((select max(c.i_cliente_cliente) from cliente as c)+1,'Camila','12354263254','1990-08-04',02);
insert into cliente values ((select max(c.i_cliente_cliente) from cliente as c)+1,'Bolsonaro','12365214523','1965-08-11',03);
insert into cliente values ((select max(c.i_cliente_cliente) from cliente as c)+1,'Lula','12365254263','1966-09-15',03);
insert into cliente values ((select max(c.i_cliente_cliente) from cliente as c)+1,'Luanda','23365214529','1997-03-22',01);
insert into cliente values ((select max(c.i_cliente_cliente) from cliente as c)+1,'Jamerson','52362452368','1952-03-12',01);

insert into cliente (s_nomecliente_cliente,s_cpf_cliente,i_tipocliente_cliente) values ('Roberto','55555555555',01);/* Inserção apenas nos campos obrigatorios exemplo*/

/* DQL - SELECT */

select* from tipocliente;
select* from cliente;