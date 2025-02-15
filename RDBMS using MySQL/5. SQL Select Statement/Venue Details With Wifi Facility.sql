select Venue_id, Venue_name, Location, Venue_Cost from Venue_Master 
where Wifi='Yes' and Location != 'New York' and Location != 'Austin' 
order by Venue_Cost;