select Venue_id, Venue_name, Venue_Cost, Location from Venue_Master 
where Capacity between 1000 and 20000 
order by Venue_name;