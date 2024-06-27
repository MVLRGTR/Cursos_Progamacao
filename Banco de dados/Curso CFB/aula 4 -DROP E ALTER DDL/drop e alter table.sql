/*drop schema cfbcursos; comando para deletar o banco de dados */
drop table cliente;

alter table cliente modify column s_nomecliente_cliente varchar(30);
alter table cliente add i_tipocliente_cliente int not null default 1;
alter table cliente drop column i_tipocliente_cliente;
alter table cliente modify column i_tipocliente_cliente int not null;
