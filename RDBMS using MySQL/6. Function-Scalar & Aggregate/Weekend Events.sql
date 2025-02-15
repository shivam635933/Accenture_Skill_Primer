select enquiry_id, cust_id 
from enquiry_master 
where dayname(start_date) in ('Saturday', 'Sunday') 
and dayname (end_date) in ('Saturday', 'Sunday') 
order by cust_id;