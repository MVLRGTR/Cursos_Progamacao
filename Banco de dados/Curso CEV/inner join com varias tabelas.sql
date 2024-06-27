/*No exemplo abaixo temos a aseguite relação  gafanhotos (1) ---->(n) gafanhoto_assiste_curso (n) <---- (1) cursos*/
select * from gafanhotos;
select * from gafanhoto_assiste_curso;
select * from cursos;
describe gafanhoto_assiste_curso;


create table gafanhoto_assiste_curso (
id int not null auto_increment,
data date,
idgafanhoto int,
idcurso int,
primary key(id),
foreign key(idgafanhoto) references gaganhotos(id),
foreign key(idcurso) references cursos(idcurso)
) default charset = utf8mb3;


insert into gafanhoto_assiste_curso values
(default, '2014-03-01','1','2');

select * from gafanhotos
join gafanhoto_assiste_curso on gafanhotos.id = gafanhoto_assiste_curso.idgafanhoto;

select gafanhotos.id ,gafanhotos.nome, gafanhoto_assiste_curso.idgafanhoto ,gafanhoto_assiste_curso.idcurso from gafanhotos
join gafanhoto_assiste_curso on gafanhotos.id = gafanhoto_assiste_curso.idgafanhoto;

select gafanhotos.nome,cursos.nome  from gafanhotos
join gafanhoto_assiste_curso on gafanhotos.id = gafanhoto_assiste_curso.idgafanhoto
join cursos on gafanhoto_assiste_curso.idcurso = cursos.idcurso;
