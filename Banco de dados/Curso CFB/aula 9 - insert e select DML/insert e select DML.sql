/*CREATE TABLE `cliente_auxiliar` (
  `i_cliente_cliente` int NOT NULL AUTO_INCREMENT,
  `s_nomecliente_cliente` varchar(50) NOT NULL,
  `s_cpf_cliente` varchar(11) NOT NULL,
  `d_datanascim_cliente` datetime DEFAULT NULL,
  `i_tipocliente_cliente` int NOT NULL,
  PRIMARY KEY (`i_cliente_cliente`),
  KEY `fk_tipocliente` (`i_tipocliente_cliente`),
  CONSTRAINT `fk_tipocliente_aux` FOREIGN KEY (`i_tipocliente_cliente`) REFERENCES `tipocliente` (`i_tipocliente_tipocliente`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci*/

select * from cliente;
select *from cliente_auxiliar;

insert into cliente_auxiliar 
	(i_cliente_cliente , s_nomecliente_cliente ,s_cpf_cliente, d_datanascim_cliente,i_tipocliente_cliente)
	select
	i_cliente_cliente, 
	s_nomecliente_cliente,
	s_cpf_cliente, 
	d_datanascim_cliente,
	i_tipocliente_cliente
	from cliente;

