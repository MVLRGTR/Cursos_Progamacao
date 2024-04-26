CREATE USER 'novo'@'localhost' IDENTIFIED WITH mysql_native_password BY 'Senha12345';
GRANT ALL PRIVILEGES ON *.* TO 'novo'@'localhost' WITH GRANT OPTION;
FLUSH PRIVILEGES;

SELECT * FROM usuarios;

ALTER TABLE usuarios
DROP COLUMN data_nascimento;
