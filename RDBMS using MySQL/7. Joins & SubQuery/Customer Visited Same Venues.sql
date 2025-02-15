SELECT c1.c_first_name, 
       c2.c_first_name, 
       c1.city, 
       e1.venue_id
FROM Customer_Master c1
JOIN Enquiry_Master e1 ON c1.cust_id = e1.cust_id
JOIN Customer_Master c2 ON c1.city = c2.city AND c1.cust_id != c2.cust_id
JOIN Enquiry_Master e2 ON c2.cust_id = e2.cust_id AND e1.venue_id = e2.venue_id;
