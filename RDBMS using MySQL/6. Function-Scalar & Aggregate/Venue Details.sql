select 
    venue_name, 
    venue_cost, 
    Case 
        when venue_cost between 50000 and 200000 then 'Medium Cost' 
        When venue_cost<50000 then 'Low Cost' 
        When venue_cost >200000 then 'High Cost' 
    End as cost_category 
from venue_master 
order by capacity desc;