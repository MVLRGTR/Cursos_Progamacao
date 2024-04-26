select * from cliente
where right(s_cpf_cliente,1)=5 or right(s_cpf_cliente,1)=0 or right(s_cpf_cliente,1)=2;

/*Como pode ser observado caso eu quisesse aumentar o número de consultas o código ficaria muito grande por isso iremos utilizar o operador in*/
select * from cliente
where right(s_cpf_cliente,1) in (5,0,2);/*Tem a mesma função do comando acima só que de uma maneira resumida*/

/*Consulta com in e select*/
/*Aqui consulto todos os cliente que nasceram nesse intervalo de data*/
select * from cliente 
where d_datanascim_cliente in 
(select 
	d_datanascim_cliente 
from 
	cliente
where d_datanascim_cliente > '1990-01-01' and d_datanascim_cliente < '2010-01-01');