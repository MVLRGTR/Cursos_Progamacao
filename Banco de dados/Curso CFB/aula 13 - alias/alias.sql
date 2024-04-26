/*ALIAS nada mais é do que aplicar um apelido a coluna*/

select 
	i_cliente_cliente as idCliente,
	s_nomecliente_cliente as nomeCliente,
	i_tipocliente_cliente as tipoCliente,
	i_cliente_cliente * 2 as valorCliente
from cliente;