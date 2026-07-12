SELECT CONCAT(c_first_name, ' lives in ', city, ' and ', 
              CASE 
                  WHEN gender = 'Male' THEN 'his' 
                  WHEN gender = 'Female' THEN 'her' 
              END, 
              ' phone number is ', phoneno) AS customer_info 
FROM customer_master 
ORDER BY c_first_name DESC;
