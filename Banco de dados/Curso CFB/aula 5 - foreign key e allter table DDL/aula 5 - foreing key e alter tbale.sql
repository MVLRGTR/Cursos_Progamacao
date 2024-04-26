create table tipocliente(
i_tipocliente_tipocliente int primary key auto_increment,
s_dsctipocliente_tipocliente varchar(150) not null);

/*Criação da Foren Key alter table <tabela origem> add constraint <nome_restrição> forein key (<campo_tabela>) references <tabela destino> (<campo_tabela_destino>)*/

/* Criando uma chave estrangeira na tabela cliente*/
/*No caso da chave estrangeira nos criamos uma restrição na tabela cliente pois toda vez que formos colocar uma valor na coluna i_tipocliente_cliente  esse mesmo valor também terá que existir na outra tabela tipocliente , por isso falamos em restrição*/
alter table cliente add constraint fk_tipocliente foreign key (i_tipocliente_cliente) references tipocliente (i_tipocliente_tipocliente);


