select * from produtos;
select * from pedidos;
select * from usuarios;
describe usuarios;
SELECT user, host FROM mysql.user;

SELECT * FROM produtos WHERE i_idproduto_produtos = 1;
UPDATE produtos SET s_nome_produtos = 'Calça' , i_preco_produtos = 58.98 WHERE i_idproduto_produtos = 1;
INSERT INTO pedidos (i_idpedidos_pedidos ,produtos_i_idproduto_produtos,i_quantidade_pedidos) VALUES (2,2,1);

UPDATE pedidos SET produtos_i_idproduto_produtos = 55, i_quantidade_pedidos = 3 WHERE i_idpedidos_pedidos = 2;
ALTER TABLE pedidos MODIFY COLUMN i_idpedidos_pedidos INT AUTO_INCREMENT;
UPDATE pedidos SET produtos_i_idproduto_produtos = 4 , i_quantidade_pedidos = 2 WHERE i_idpedidos_pedidos = 2;

select  i_idpedidos_pedidos , i_quantidade_pedidos ,i_idproduto_produtos , s_nome_produtos ,i_preco_produtos
from pedidos  
inner join produtos on produtos.i_idproduto_produtos = pedidos.produtos_i_idproduto_produtos;

delete  from produtos where i_idproduto_produtos = 12;



alter table produtos add column s_image_produto varchar(500);

create table usuarios (
id_usuario_usuarios integer not null primary key auto_increment,
s_email_usuarios varchar(100) not null,
s_senha_usuarios varchar(100) not null
);

alter table usuarios add unique(s_email_usuarios);

SELECT * FROM usuarios WHERE s_email_usuarios = 'marcoscastro360@gmail.com';

create table images_produto (
id_image int not null primary key auto_increment,
id_produto int not null,
caminho varchar(255) not null,
foreign key (id_produto) references produtos (i_idproduto_produtos)
);
