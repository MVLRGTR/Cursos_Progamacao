/*O distinct serve basicamente para trazer nas consultas apenas valores unitarios*/
select* from venda;
select * from cliente;

insert into venda values(1,1,'2020-12-05',125.5);
insert into venda values(1,1,'2020-12-12',123.5);
insert into venda values(2,2,'2020-12-01',535.2);
insert into venda values(3,3,'2020-11-10',50.49);
insert into venda values(4,2,'2020-10-15',1584.25);
insert into venda values(5,1,'2020-11-20',327.80);
insert into venda values(6,3,'2020-09-08',15);
insert into venda values(7,3,'2020-09-07',12.99);
insert into venda values(8,3,'2020-11-22',59.90);
insert into venda values(9,1,'2020-10-10',235.50);
insert into venda values(10,2,'2020-01-23',7.99);
insert into venda values(11,4,'2020-02-15',123.5);
insert into venda values(12,5,'2020-03-07',535.2);
insert into venda values(13,6,'2020-04-01',50.49);
insert into venda values(14,5,'2020-04-01',1584.25);
insert into venda values(15,5,'2020-05-20',327.80);
insert into venda values(16,7,'2020-03-18',15);
insert into venda values(17,4,'2020-09-07',12.99);
insert into venda values(18,3,'2020-12-24',59.90);
insert into venda values(19,8,'2020-06-25',235.50);
insert into venda values(20,2,'2020-06-26',7.99);

select * from venda where i_cliente_venda = 1;/*Aqui eu faço um filtro trazendo csomente a vendas para o cliente 1*/
select i_cliente_venda from venda;/*Aqui faço um filtro com todos os clientes e suas compras ou seja temos duplicidade*/
select distinct i_cliente_venda from venda;/*agora realizo o mesmo comando anterior adicionando o distinct e trazendo os valores unitarios de cada cliente */