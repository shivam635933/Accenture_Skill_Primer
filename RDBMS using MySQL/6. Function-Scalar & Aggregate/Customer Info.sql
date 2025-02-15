select concat(c_first_name,' lives in', city, and 
        case 
            When gender='Male' then 'his' 
            When gender='Female' then 'her' 
        End, 'phone number is', phoneno) as customer_info 
from customer_master 
order by c_first_name desc;