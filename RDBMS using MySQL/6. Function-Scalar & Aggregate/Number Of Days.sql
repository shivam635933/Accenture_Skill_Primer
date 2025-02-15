select enquiry_id, cust_id, venue_id, date_format(start_date, '%M') as month_name, 
    datediff(end_date+1, start_date) as no_of_days 
from enquiry_master 
where date_format(start_date, '%M') = 'December' 
order by no_of_days desc;