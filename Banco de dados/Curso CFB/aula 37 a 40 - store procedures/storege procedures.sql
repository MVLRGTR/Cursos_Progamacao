/**/
DELIMITER $$
create procedure inicial()
begin
	
    declare x int ; #aqui declaro x e o seu tipo de variavel
    set x = 10 ;    #adiciono o valor 10 a variavél xa
    select x ;		#retorno o valor de x que é igual a 10
    
    
end $$

DELIMITER $$
create procedure inicial2(in curso varchar(50))
begin
	
    declare x varchar(20) ; 
    set x = 'Youtube' ;  
    select x,curso ;		
    
end $$
DELIMITER ;


call inicial2('curso');