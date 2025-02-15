SELECT V.Venue_Id, V.Venue_name, V.Location, E.Category
FROM Venue_Master V
JOIN Event_Master E ON V.Event_Id = E.Event_Id
JOIN Enquiry_Master EM ON V.Venue_Id = EM.Venue_Id
JOIN Booking_Master BM ON EM.Enquiry_Id = BM.Enquiry_Id
WHERE (
    SELECT COUNT(*)
    FROM Booking_Master BM1
    JOIN Enquiry_Master EM1 ON BM1.Enquiry_Id = EM1.Enquiry_Id
    WHERE EM1.Venue_Id = 'V10'
) = (
    SELECT COUNT(*)
    FROM Booking_Master BM2
    JOIN Enquiry_Master EM2 ON BM2.Enquiry_Id = EM2.Enquiry_Id
    WHERE EM2.Venue_Id = V.Venue_Id
) AND V.Venue_Id <> 'V10'
ORDER BY V.Venue_name DESC;
