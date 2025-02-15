select c_first_name,venue_id,start_date,end_date 
from customer_master c join enquiry_master e on c.cust_id=e.cust_id
order by c_first_name;