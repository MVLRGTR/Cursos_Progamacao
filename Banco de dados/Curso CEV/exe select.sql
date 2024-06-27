/*Exercicios da aula parte 2*/
select * from gafanhotos where nascimento between  '2000/01/01' and '2015/12/31';
select * from gafanhotos where profissao = 'programador';
select * from gafanhotos where nome like 'j%' and nacionalidade = 'Brasil' and sexo ='F';
select nome , nacionalidade from gafanhotos where nome like '%silva%' and nacionalidade != 'Brasil' and peso < 100;
select max(altura) from gafanhotos where nacionalidade = 'brasil';
select avg(peso) from gafanhotos ;
select min(peso) from gafanhotos where sexo = 'F' and nascimento between '1990/01/01' and '2000/12/31';
select count(*) from gafanhotos where altura > '1.90'  and sexo = 'F';
/*------------------------------------------part 3-----------------------------------------------*/
select profissao, count(*) from gafanhotos group by profissao order by count(*) desc;
select sexo,count(*) from gafanhotos  where nascimento > '2005/01/01' group by sexo;
select nacionalidade , count(*) from gafanhotos where nacionalidade != 'Brasil' group by nacionalidade having count(*) > 3;
select avg(altura) from gafanhotos;
select altura, count(*) from gafanhotos where peso > '100' group by altura having altura > (select avg(altura) from gafanhotos);
