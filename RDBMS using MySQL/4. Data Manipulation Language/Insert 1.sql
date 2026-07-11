insert into Booking_Master Values ('B101', 'ΕΝ1001', 40000, 'Cash'); 
insert into Booking_Master Values ('B102', 'EN1012', 750000, 'Online'); 
insert into Booking_Master Values('B103', 'EN1016', 16000, 'Cheque'); 
insert into Booking_Master Values ('B104', 'EN1007', 10000, 'Cash');


INSERT INTO Booking_Master (Booking_id, Enquiry_Id, Total_amount, Mode_of_Pay) 
VALUES 
('B101', 'EN1001', 40000, 'Cash'),
('B102', 'EN1012', 750000, 'Online'),
('B103', 'EN1016', 16000, 'Cheque'),
('B104', 'EN1007', 10000, 'Cash');

SELECT * FROM Booking_Master;
