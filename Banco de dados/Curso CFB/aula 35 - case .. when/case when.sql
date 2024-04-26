/*O CASE WHEN nada mas é do que um teste de varias condições com um retorno
case
	when cond1 then res1
    when cond2 then res2
    when cond3 then res3
    else res
*/


/*Aqui faço uma consulta aonde a data é nula eu substituo pela data atual*/
select
	i_cliente_cliente,
    s_nomecliente_cliente,
    s_cpf_cliente,
    i_tipocliente_cliente,
    case
		when d_datanascim_cliente is null then now()
        else d_datanascim_cliente 
	end as 'Data nascimento'
from cliente ;

/*Aqui faço uma consulta aonde verifico quem é maior ou menor de idade*/
select
	i_cliente_cliente,
    s_nomecliente_cliente,
    s_cpf_cliente,
    i_tipocliente_cliente,
    case
		when TIMESTAMPDIFF(YEAR, d_datanascim_cliente, CURDATE()) >= 18 then 'Maior de Idade'
        else 'Menor de Idade'
	end as 'Maioridade_Penal'
from cliente ;

/*No select em questão eu conto quantos são de maior e de menor e agrupo para mostrar*/
select
    case
		when TIMESTAMPDIFF(YEAR, d_datanascim_cliente, CURDATE()) >= 18 then 'Maior de Idade'
        else 'Menor de Idade'
	end as 'maioridade' , count(*)
from cliente 
group by maioridade;

