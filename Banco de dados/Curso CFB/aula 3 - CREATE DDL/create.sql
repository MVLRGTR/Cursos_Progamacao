/*create schema cfbcursos; tem a mesma função do comando abaixo*/
/*a diferença entre char e varchar e que um cria um local na memoria fixo enquanto o outro e variavel , exemplo varchar(50) tamanho maximo de 50 caracteres char(50) idependente da quantidade de letras o espaço sera de 50*/
/*create database cfbcursos;*/

create table cliente(
i_cliente_cliente INT primary key not null auto_increment , 
s_nomecliente_cliente varchar(50) not null,
s_cpf_cliente varchar(11) not null , 
d_datanascim_cliente datetime
);