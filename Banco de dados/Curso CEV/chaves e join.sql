use cadastro;
describe gafanhotos;
describe cursos;
select * from cursos;
select * from gafanhotos;

/*No exemplo abaixo temos a aseguite relação  gafanhotos  ---->(1) prefere (n) <---- cursos*/

alter table gafanhotos add column prefere int;/*Adicionando uma coluna na mminha tabela*/
alter table gafanhotos add foreign key (prefere) references cursos(idcurso);/*Adicionando a chave estrangeira,dizendo que a coluna fazendocurso da tabela gafanhotos está relacionada a coluna idcurso da tabela cursos */

update gafanhotos set prefere = '6' where id = '1'; /*Aqui estou informando que a chave estrangeira é 6 e o meu primarykey local é 1 que no caso e daniel morais*/

select gafanhotos.nome , gafanhotos.prefere , cursos.nome , cursos.ano from gafanhotos join cursos;/*Nesse comando aqui faço a junção da tabela gafanhotos com a de cursos só que não de maneira inteligente ou seja cada gafanhoto vai estar relacionado a todos  os cursos*/
select gafanhotos.nome , gafanhotos.prefere , cursos.nome , cursos.carga, cursos.ano from gafanhotos join cursos on gafanhotos.prefere = cursos.idcurso;/*Igual ao camonda abaixo só que faço a relação com as primarykeys*/
select gafanhotos.nome , gafanhotos.prefere , cursos.nome , cursos.carga, cursos.ano from gafanhotos join cursos on gafanhotos.prefere = cursos.idcurso order by gafanhotos.nome;
select g.nome , g.prefere , c.nome , c.carga, c.ano from gafanhotos as g join cursos as c on g.prefere = c.idcurso;/*Igual aos comandos acima só que com as abreviações*/

select g.nome , g.prefere , c.nome , c.carga , c.ano from gafanhotos as g left outer join cursos as c on g.prefere  = c.idcurso;/*Nesse comando aqui mostro todos os gafanhotos mesmo aqueles que não estão fazendo curso porque o comando join sozinho só mostra a intersecção*/
select g.nome , g.prefere , c.nome , c.carga , c.ano from gafanhotos as g right outer join cursos as c on g.prefere  = c.idcurso;/*Igual ao comando de cima só que agora dando preferência aos cursos*/