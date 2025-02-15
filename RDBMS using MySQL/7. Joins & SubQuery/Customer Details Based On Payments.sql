select distinct c.cust_id, c.c_first_name, c.phoneno, c.email from customer_master c 
join enquiry_master e on c.cust_id=e.cust_id 
join booking_master b on e.enquiry_id=b.enquiry_id 
where b.mode_of_pay= 'Online' 
order by c.cust_id;