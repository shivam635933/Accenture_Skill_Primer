select c.c_first_name, sum(b.total_amount) as total_booking_amount 
from customer_master c 
join enquiry_master e on c.cust_id=e.cust_id 
join booking_master b on e.enquiry_id=b.enquiry_id 
group by c.c_first_name 
having sum(b.total_amount)> (select avg(total_amount) from booking_master) 
order by c.c_first_name;