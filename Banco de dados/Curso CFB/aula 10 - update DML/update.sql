select * from cliente;
/*update cliente set s_nome_cliente = 'Bruno P. Campos' comando extremamente perigoso , pois atualizara todos os campos com o valr Bruno...*/
update cliente set s_nomecliente_cliente = 'Bruno P. Campos' where i_cliente_cliente = 1;
update cliente set s_nomecliente_cliente = 'Bruno P. Campos' , s_cpf_cliente = '12365985214' where i_cliente_cliente = 1;

/*Fazendo um update em todos os clientes*/
update cliente set i_tipocliente_cliente = 1 where i_cliente_cliente > 0;
delete from cliente where i_cliente_cliente > 0;

/*Atualizando a tabela cliente através da tabela cliente_aux*/
insert into cliente select*from cliente_auxiliar;

