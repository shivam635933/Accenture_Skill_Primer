select v.venue_name, count(e.cust_id) as No_Of_Customers 
from venue_master v 
left join enquiry_master e on v.venue_id=e.venue_id 
group by v.venue_name 
order by v.venue_name;