show columns from pessoas;

alter table pessoas add column profissao varchar(10);

select * from gafanhotos;

alter table pessoas drop column profissao;

alter table pessoas add column profissao varchar(10) after nome;

alter table pessoas modify column profissao varchar(20);

alter table pessoas modify column profissao varchar(20) not null default '';

alter table pessoas change profissao prof varchar(20);

alter table pessoas rename to gafanhotos;

create table if not exists cursos(
nome varchar(30) NOT NULL UNIQUE,
descricao text,
carga int unsigned,
totaulas int unsigned,
ano year default '2016'
)default char set = utf8mb4 ;

alter table cursos add column idcursos int first;

alter table cursos change idcursos idcurso int ;

alter table cursos add primary key(idcurso);

describe cursos;

drop table if exists teste;