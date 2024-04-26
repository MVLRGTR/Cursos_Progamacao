DELIMITER $$
create procedure loopwhile(in max int, out soma int)
begin

	declare x int default 0;
    
    while(x < max)do
		set x = x+ 1;
    end while;
    
    set soma = x ;

end $$
DELIMITER ;

call loopwhile(20,@somanumeros);
select  @somanumeros;