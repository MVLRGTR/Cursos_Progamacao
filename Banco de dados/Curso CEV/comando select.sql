use cadastro;

select * from gafanhotos;
select * from cursos;

select * from cursos order by nome ; /* mostrando para min em ordem a coluna selecionada nome */
select * from cursos order by nome desc ; /* mostrando para min em ordem a coluna selecionada nome de cima para baixo */

select nome , carga , ano from cursos; /* filtras somente as colunas desejadas*/
select ano ,nome , carga from  cursos order by ano  ;/*Filtra as colunas desejadas e ordena por ano*/
select ano ,nome , carga from  cursos order by ano , nome  ;/*Filtra as colunas desejadas e ordena por ano e depois pelo nome*/

select * from cursos where ano = '2016' order by nome; /* Filtra todas as linhas onde ano é = 2016 e ordena por nome */
select nome , carga from cursos where ano = '2016' order by nome; /* Filtra as linhas e coluna selecionadas onde ano é = 2016 e ordena por nome */
select nome , descricao from cursos where ano <= '2015' order by nome; /* Filtra todas as linhas e colunas selecionadas onde ano é <= 2016 e ordena por nome */

select * from cursos where totaulas between '20' and '30' order by nome; /* Filtra todas as linhas onde o totaulas está entre 20 e 30 ordenando por nome*/
select * from cursos where ano between 2014 and 2016 order by ano desc , nome asc;/*Igual o comando acima mudano apenas que ordeno primeiro ano de forma descente e nome de forma ascendente*/

select nome ,descricao,ano from cursos where ano in(2014,2015,2019) order by ano;/*Filtra todas as linhas e colunas selecionas onde ano igual a 2014 e 2015*/

select * from cursos where carga > 35 and totaulas < 30 order by nome;/*Mesma Sintaxe dos comandos acima com a diferença do operador logico*/
select nome, carga , totaulas from cursos where carga > 35 and totaulas < 30 order by nome;/*Mesma Sintaxe dos comandos acima com a diferença do operador logico*/
select nome , carga , totaulas from cursos where carga > 35 or totaulas < 30 order by nome;/*Mesma Sintaxe dos comando acima com a diferença do operador logico*/

/*--------------------------------------------------Parte 2-----------------------------------------------------*/
select * from cursos where nome like 'p%'; /*Estou buscando todos os cursos que começam com p*/
select * from cursos where nome like '%a'; /*Estou buscando todos os cursos que terminam com a*/
select * from cursos where nome like '%a%'; /*Estou buscando todos os cursos que tenham a*/
select * from cursos where nome  not like '%a%'; /*Estou buscando todos os cursos que não tenham a em lugar nenhum*/
select * from cursos where nome  like 'ph%p%'; /*Estou buscando todos os cursos que não tenham a em lugar nenhum*/
select * from cursos where nome  like 'p_p%';/*Estou buscando cursos que tenho p uma letra p e qualquer coisa reperesentado pelo %*/

select * from gafanhotos where nome like '%silva%';/*Estou buscando nomes que contenham silva no nome em qualquer lugar*/

select  nacionalidade from gafanhotos;
select distinct nacionalidade from gafanhotos order by nacionalidade ;/*Estou pegando aqui as nacionalidades de forma não repetida diferente do comando acima*/

select count(*) from cursos; /*Estou contanto tudo*/
select count(*) from cursos where carga > 40;

select max(carga) from cursos;/*Me mostra qual é a maior carga dentro da tabela cursos*/
select max(totaulas) from cursos where ano = '2016';/*Me mostra o maximo de aulas dos cursos que ocorreram em 2016*/
select nome ,min(totaulas) from cursos where ano = '2016';/*Me mostra o minimo de aulas dos cursos que ocorreram em 2016 e o seu nome*/

select sum(totaulas) from cursos where ano ='2016';/*Me mostra o total de aulas somadas de 2016*/

select avg(totaulas) from cursos where ano = '2016';/*Tira a media de aulas dos cursos ministrados em 2016*/

/*--------------------------------------------------Parte 3-----------------------------------------------------------*/

select distinct carga from cursos order by carga; /*Estou pegando de forma unica todas as cargas de cursos existentes*/
select carga from cursos group by carga; /*Aqui estou agrupando os cursos que tem a mesma carga horaria*/
select carga, count(*) from cursos group by carga;/*Aqui eu estou agrupando e contando quantas ocorrencias de cada tipo de carga horaria*/
select carga, count(*) from cursos group by carga order by carga desc;/*Aqui eu estou agrupando e contando quantas ocorrencias de cada tipo de carga horaria*/

select * from cursos where carga = 40;

select carga , count(*) from cursos where totaulas = 30 group by carga ;/*Aqui eu estou seperando quantas ocorrencias tem 30 aulas e depois agrupando por carga*/ 
select ano, count(*) from cursos group by ano;
select ano , count(*) from cursos group by ano order by count(*) desc;/*Semelhante ao comando da linha 55 só que com adiferença de estrar ordenando pela coluna count(*)*/
select ano , count(*) from cursos group by ano having count(*) >=5 order by count(*) desc;/*Semelahante ao comando acima só que nesse caso eu só vou mostras os anos que tiveram 5 ou mais cursos*/
select  ano , count(*) from cursos where  totaulas > 30 group by ano  having ano > 2013 order by count(*) desc ; /*Estou seprando por ano onde totaulas e > 30 e ano > 2013 nesses sub grupos além de ordenalos pelo count*/

select avg(carga) from cursos;/*Estou fazendo a média de horas de todos os curso*/
select carga , count(*) from  cursos where ano > 2015 group by carga having carga > (select avg(carga) from cursos);/*aqui eu estou seperando os cursos com ano superior a 2015 e agrupando o mesmos por carga horaria depois utilizando o having estou fazendo um filtro ainda maior somente daqueles que tem carga horaria maior do que a média do grupo inteiro*/


