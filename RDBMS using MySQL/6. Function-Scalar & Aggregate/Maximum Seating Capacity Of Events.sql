select event_id, max(capacity) as maximum_seating_capacity 
from venue_master 
where wifi='Yes' 
group by event_id 
order by maximum_seating_capacity desc;