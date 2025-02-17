create view Customer_Info as 
select 
    c.C_first_name, 
    c. Phoneno, 
    c.City, 
    b. Total_amount as Total_amount 
from Customer_master c 
join Enquiry_master e on c.Cust_id=e.Cust_id 
join Booking_master b on e. Enquiry_id=b.Enquiry_id 
where Total_amount<60000 
order by c.C_first_name;