use cadastro;

insert into pessoas
(nome ,nascimento ,sexo ,peso ,altura ,nacionalidade)
values
('Lohanna','1995-05-08','F','58.5','1.68','Brasil');

insert into pessoas
(id,nome ,nascimento ,sexo ,peso ,altura ,nacionalidade)
values
(default,'Creusa','1985-05-08','F','68.5','1.53',default);

insert into pessoas values 
(default,'Pedro','1995-03-07','M','88.7','1.82','Irlanda'),
(default,'Camilo','1994-04-28','M','99.7','1.84',default),
(default,'Taimara','1995-02-07','F','68.7','1.66',default);

select * from pessoas;