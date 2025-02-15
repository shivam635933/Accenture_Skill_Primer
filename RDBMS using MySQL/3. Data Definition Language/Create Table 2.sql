create table Venue_Master( 
    Venue_id varchar(10) primary key, 
    Event_id varchar(10), 
    Venue_name varchar(30), 
    Location varchar(50), 
    Venue_Cost int, 
    Food varchar(10), 
    Capacity int, 
    Wifi varchar(10), 
    Description varchar(50), 
    foreign key(Event_id) references Event_Master(Event_id) 
);