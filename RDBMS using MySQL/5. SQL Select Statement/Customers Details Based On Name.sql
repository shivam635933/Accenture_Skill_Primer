select C_first_name,c_last_name,street,City from Customer_master
where C_first_name like '_m%' 
order by C_first_name;