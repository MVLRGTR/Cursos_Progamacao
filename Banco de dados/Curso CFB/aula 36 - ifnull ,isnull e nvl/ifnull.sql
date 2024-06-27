/*
My SQL  = ifnull ou coalesce
SqlServer = isnull
Oracle = nvl

o comando em questão funciona da seguinte maneira , após encontrar um valor nulo na coluna informada substituimoos o mesmo a exemplo ifnull(cliente.i_cliente_cliente,2)
*/

update produtovenda set i_qtde_produtovenda= null where i_produtovenda_produtovenda = 1;
/*Modo antigo , usando o case when 
Vale resaltar se eu fizesse um select * o comando abaixo não iria substituir a coluna i_qtde_produtovenda pelo valor que eu quero e sim a nova coluna criada
*/
select 
	i_produtovenda_produtovenda,
    i_venda_venda,
    case
		when i_qtde_produtovenda is null then 'Erro'
        else i_qtde_produtovenda
	end as 'Quantidade'
from produtovenda;

/*Sintaxe do coamando ifnull(coluna,valor a ser substituido)*/

/*AQUI MOSTRO A UTLIDADE NO ISNULL EM UMA CONSULTA*/
select 
* ,round((f_precoun_produtovenda * ifnull(i_qtde_produtovenda,0)),2) as 'Total'
from produtovenda;



