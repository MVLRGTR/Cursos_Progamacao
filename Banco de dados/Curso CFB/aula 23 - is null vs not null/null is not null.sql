
select * from cliente_auxiliar;

insert into cliente_auxiliar values ( (select max(ca.i_cliente_cliente) from cliente_auxiliar as ca)+1,'Valkisneide',12536547892,null,1);
insert into cliente_auxiliar values ( (select max(ca.i_cliente_cliente) from cliente_auxiliar as ca)+1,'Alcinclésio',12365236547,null,2);
insert into cliente_auxiliar values ( (select max(ca.i_cliente_cliente) from cliente_auxiliar as ca)+1,'Nestor',56328963146,null,3);
insert into cliente_auxiliar values ( (select max(ca.i_cliente_cliente) from cliente_auxiliar as ca)+1,'Adamastor',56932145369,null,2);
insert into cliente_auxiliar values ( (select max(ca.i_cliente_cliente) from cliente_auxiliar as ca)+1,'Mordonório',12368563214,null,1);
insert into cliente_auxiliar values ( (select max(ca.i_cliente_cliente) from cliente_auxiliar as ca)+1,'Salomido',63589632145,null,1);

/*Filtrando todos os clientes que tem a data nula*/
select * from cliente_auxiliar
where d_datanascim_cliente is null;

/*Negando o comando acima*/
select * from cliente_auxiliar
where d_datanascim_cliente is not null;