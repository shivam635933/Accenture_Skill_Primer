public class Ticket 
{ 
    private int ticketid; 
    private int price; 
    private static int availableTickets;

    public int calculateTicketCost(int nooftickets) 
    { 
        if(availableTickets>=nooftickets) 
        { 
            availableTickets-=nooftickets; 
            return nooftickets*price; 
        } 
        return -1; 
    }

    public void setTicketId(int ticketid) 
    { 
    t   his.ticketid=ticketid; 
    } 
    public int getTicketId() 
    { 
        return ticketid; 
    } 
    
    public void setPrice(int price) 
    { 
        this.price=price; 
    } 
    public int getPrice() 
    {
        return price; 
    } 

    public void setAvailableTickets (int availableTickets) 
    { 
        this.availableTickets=availableTickets; 
    } 
    public int getAvailableTickets() 
    { 
        return availableTickets; 
    }
}