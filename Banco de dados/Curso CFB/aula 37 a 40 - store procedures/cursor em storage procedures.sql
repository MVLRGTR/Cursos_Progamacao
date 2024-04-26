/*Cursos*/

DELIMITER $$
create procedure somavendas(out soma float(10,2))
begin
	
    declare valorvenda float(10,2) default 0;
    declare fimloop int default 0;
    
    declare meucursor cursor for select f_valor_venda from venda; #associação do conteúdo do meu cursor
    declare continue handler for not found set fimloop = 1; #quando não for retornado mais nada seto a variavél como 1 para encerramento do loop
    
    set soma = 0;
    
    open meucursor;
    while(fimloop =  0) do
		fetch meucursor into valorvenda; #o fecth aqui faz a administração a cada loop , indo de linha em linha em cada passo do loop
        set soma = soma + valorvenda;    #aqui coloco o valor iterado dentro da variavel valorvenda
	end while;
    
    
end $$
DELIMITER ;

call somavendas(@vendas);
select  round(@vendas,2);