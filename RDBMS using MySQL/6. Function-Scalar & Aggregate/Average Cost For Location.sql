select location, Round (avg(venue_cost), 2) as Avg_cost 
from venue_master 
where capacity>1000 
group by location 
order by location;