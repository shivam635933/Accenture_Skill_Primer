SELECT E.Category, V.Venue_name, V.Capacity
FROM Venue_Master V
JOIN Event_Master E ON V.Event_Id = E.Event_Id
WHERE V.Capacity = (
    SELECT MAX(VM.Capacity)
    FROM Venue_Master VM
    JOIN Event_Master EM ON VM.Event_Id = EM.Event_Id
    WHERE EM.Category = E.Category
);
