DELIMITER $$
create procedure idade (idCliente int , out idade int ,out maioridade varchar(25)) # aqui eu faço o set das varievaeis de entrada e saida
begin
	declare dt datetime;
    
    set dt = (select d_datanascim_cliente from cliente where i_cliente_cliente = idCliente);
    set idade =  (datediff(current_date(),dt)/365);
    
    if(idade >=18 ) then 
		set maioridade = 'Maior de Idade';
    else 
		set maioridade = 'Menor de Idade';
    end if;
    
    
end $$
DELIMITER ;

call idade(5,@idade_do_cliente,@maioridade);  #Aqui tenho a procedure com o in e o out que abixo chamo para mostrar o seu resultado
select @idade_do_cliente,@maioridade;

select * from cliente;