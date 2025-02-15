select e.cust_id, b.booking_id, datediff(e.end_date+1,e.start_date) as Days 
from enquiry_master e 
join booking_master b on e.enquiry_id=b.enquiry_id 
where datediff(e.end_date+1,e.start_date) >3 
order by e.cust_id desc;