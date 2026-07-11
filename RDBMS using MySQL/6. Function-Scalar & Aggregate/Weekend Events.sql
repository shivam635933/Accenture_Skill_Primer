SELECT enquiry_id, cust_id
FROM enquiry_master
WHERE DAYNAME(start_date) IN ('Saturday', 'Sunday')
  AND DAYNAME(end_date) IN ('Saturday', 'Sunday')
ORDER BY cust_id ASC;
