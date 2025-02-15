Select C_first_name, Phoneno, Gender from Customer_Master 
where C_last_name is null or C_middle_name is null 
order by Phoneno;