/*Tipos de join 
inner join - é a intersecção entre duas tabelas
left join - todos os dados da primeira tabela mais a intersecção com a segunda tabela
right join - todos os dados da segunda tabela mais a intersecção com a primeira tabela
full outer join - junção por completa de ambas as tabelas

lembrando que no sql o full outer join fazemos o comando com a junção de um left e right join juntos
*/

/*Nesse tipo de Inner join temos a intersecção entre as duas tabelas */
select 
	c.i_cliente_cliente , c.s_nomecliente_cliente , v.i_venda_venda
from 
	cliente as c 
inner join venda as v on c.i_cliente_cliente = v.i_cliente_venda
;

/*Left join */
select 
	c.i_cliente_cliente , c.s_nomecliente_cliente ,v.i_venda_venda
from 
	cliente as c 
left join venda as v on c.i_cliente_cliente = v.i_cliente_venda
;

/*Right join */
select 
	c.i_cliente_cliente , c.s_nomecliente_cliente ,v.i_venda_venda
from 
	cliente as c 
right join venda as v on c.i_cliente_cliente = v.i_cliente_venda
;