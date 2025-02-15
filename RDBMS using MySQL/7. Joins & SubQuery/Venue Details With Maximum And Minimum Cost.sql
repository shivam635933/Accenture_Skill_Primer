SELECT venue_id, venue_name, location 
FROM (
    SELECT venue_id, venue_name, location, venue_cost
    FROM Venue_Master
    WHERE venue_cost = (SELECT MAX(venue_cost) FROM Venue_Master)
    UNION
    SELECT venue_id, venue_name, location, venue_cost
    FROM Venue_Master
    WHERE venue_cost = (SELECT MIN(venue_cost) FROM Venue_Master)
) AS temp
ORDER BY venue_cost;
