select c_first_name as user_name, 
    concat(substr(c_first_name, 1,3), substr(phoneno, 5,2)) as password 
from customer_master 
where email like '%gmail%' 
order by user_name;