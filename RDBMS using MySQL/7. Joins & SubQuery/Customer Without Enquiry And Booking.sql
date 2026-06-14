SELECT c.cust_id, c.c_first_name, c.city, c.phoneno
FROM Customer_Master c
LEFT JOIN Enquiry_Master e ON c.cust_id = e.cust_id
WHERE e.cust_id IS NULL
ORDER BY c.c_first_name ASC;
