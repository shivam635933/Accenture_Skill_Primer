select mode_of_pay, min(total_amount) as MINIMUM_TOTAL_AMOUNT 
from Booking_Master 
where mode_of_pay in ('Cash', 'Online') 
group by mode_of_pay 
order by MINIMUM_TOTAL_AMOUNT;