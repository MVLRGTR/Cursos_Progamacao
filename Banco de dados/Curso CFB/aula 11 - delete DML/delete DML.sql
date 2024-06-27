/*Alguns banco de dados não rodam em modo de proteção então o delete de fato pode ser um grande problema */
delete from cliente where i_cliente_cliente > 0;
select * from cliente;

/*Restaurando a tabela cliente*/
insert into cliente select * from cliente_auxiliar;

/*Deletando um id especifico*/
delete from cliente_auxiliar where i_cliente_cliente = 9;
select* from cliente_auxiliar;

/*Retornando o valor para a tabela cliente_auxiliar*/
insert into cliente_auxiliar select * from cliente where i_cliente_cliente = 9 ;
select*from cliente_auxiliar;

/*Deleteando faixa de valores*/
delete from cliente_auxiliar where i_cliente_cliente > 5;
