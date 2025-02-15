create or replace view Customer_Info as ( 
    select 
        c.c_first_name, 
        c.phoneno, 
        c.city, 
        sum(b.total_amount) 
    from customer_master c 
    join enquiry_master e on c.cust_id=e.cust_id 
    join booking_master b on e.enquiry_id=b.enquiry_id 
    group by c.c_first_name 
    having sum(b.total_amount) <60000 
    order by c.c_first_name
);