/*O operador like serve para fazer pesquisa por caracteres incompletos , exemplo b% me faz uma consulta procurando a primeira letra como b e o resto qualquer coisa*/
/*
% - qualquer coisa
- especifico a quantidade de caracter
*/

/*Faço uma consulta com todos os clientes que começam com b*/
select * from cliente
where s_nomecliente_cliente like('b%');

/*Faço uma consulta com todos os clientes que começam com b e termina com o*/
select * from cliente
where s_nomecliente_cliente like('b%o');

/*Faço uma consulta com todos os clientes que começam com b e tem 4 letras depois*/
select * from cliente
where s_nomecliente_cliente like('b____');














