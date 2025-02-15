select cust_id,c_first_name,coalesce(city,phoneno,email) contact_info
 from customer_master 
 order by contact_info;