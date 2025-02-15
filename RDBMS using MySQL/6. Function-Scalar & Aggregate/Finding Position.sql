select c_first_name, locate('m', c_first_name) as position 
from customer_master 
where city in ('Boston', 'Los Angeles') 
order by position desc, c_first_name asc;