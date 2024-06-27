/*Union*/
/*Para utlização desse comando preciso ter o mesmo números de colunas e do mesmo tipo também*/

select 'Cliente' as tabela, i_cliente_cliente,s_nomecliente_cliente from cliente
union
select 'Cliente_auxiliar' ,i_cliente_cliente,s_nomecliente_cliente from cliente_auxiliar;