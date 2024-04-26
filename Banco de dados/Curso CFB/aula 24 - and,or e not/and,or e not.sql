/*Operadores and or e not para utilizar nos filtros */

/*As duas condições tem que ser satisfeita */
select *from cliente
where i_cliente_cliente = 1 and i_tipocliente_cliente = 1
;

/*Uma ou outra condição tem que ser satisfeita*/
select * from cliente
where i_tipocliente_cliente = 1 or i_tipocliente_cliente = 3;

/*Operador not , aqui faço uma consulta aonde todos não podem ser tipocliente = 1 */
select * from cliente
where not i_tipocliente_cliente = 1;