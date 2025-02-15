select booking_id, enquiry_id, total_amount from Booking_Master 
where mode_of_pay='Cash' or mode_of_pay='Credit' 
order by enquiry_id;