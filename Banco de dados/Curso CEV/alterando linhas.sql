select * from gafanhotos;

select * from cursos ;

alter table cursos modify column idcurso int not null auto_increment;


insert into cursos values
(default,'HTML5','Curso de HTML5','40','37','2014'),
(default,'Algoritmos','Lógica de progamação','20','15','2014'),
(default,'Photoshop','Dicas de Photoshop CC','10','8','2014'),
(default,'PGP','Curso de PHP para iniciantes','40','20','2010'),
(default,'Jarva','Introdução a linguagem Java','10','29','2000'),
(default,'MySQL','Banco de Dados MySQL','30','15','2016'),
(default,'World','Curso completo de WWorld','40','30','2016'),
(default,'Sapateado','Danças Rítmicas','40','30','2018'),
(default,'Cozinha Árabe','Aprenda a fazer Kibe','40','30','2018'),
(default,'Youtuber','Gerar polêmica e ganhar inscritos','5','2','2018');

update cursos set nome = 'HTML5' where idcurso = '1';
update cursos set ano = '2014' where idcurso = '1';
update cursos set nome = 'PHP' , ano = '2015' where idcurso ='4';
update cursos set nome = 'Java' , carga = '40' , ano = '2015' where idcurso = '5' limit 1 ;

update cursos set ano = '2050' ,  carga = '800' where ano = '2018';
update cursos set ano = '2018' ,  carga = '0' where ano = '2050' limit 1;

delete from cursos where idcurso ='8';     /*Esse comando exclui uma linha somente*/
delete from cursos where ano='2050' limit 2; /*Esse comando exclui linhas onde o ano é = 2050*/

truncate table cursos ; /*Esse exclui todas as linhas de uma tabela*/

drop database cadastro;



