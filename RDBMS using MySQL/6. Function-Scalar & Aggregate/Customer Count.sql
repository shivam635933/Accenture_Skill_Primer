select count(enquiry_id) as ENQUIRY_COUNT 
from enquiry_master 
group by cust_id 
having count(enquiry_id)>1 
order by ENQUIRY_COUNT desc;