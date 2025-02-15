select distinct c.c_first_name, concat(substr(c.c_first_name,1,3), substr(c.phoneno,1,3)) as Discount_Code
from customer_master c 
join enquiry_master e on c.cust_id=e.cust_id 
join booking_master b on e.enquiry_id=b.enquiry_id 
where c.city in ('Los Angeles', 'Boston') and b.total_amount>50000 
order by c.c_first_name;