import java.util.Scanner; 
public class UserInterface 
{ 
    public static void main(String[] arg) 
    { 
        Scanner sc = new Scanner(System.in); 
        Ticket t = new Ticket(); 
        
        System.out.println("Enter movie name"); 
        String name = sc.next(); 
        
        System.out.println("Enter no of bookings"); 
        int n=sc.nextInt(); 

        System.out.println("Enter the available tickets"); 
        int availableTickets=sc.nextInt(); 

        for(int i=0;i<n;i++) 
        { 
            System.out.println("Enter the ticketid"); 
            int ticketid=sc.nextInt(); 

            System.out.println("Enter the price"); 
            int price=sc.nextInt(); 

            System.out.println("Enter the no of tickets"); 
            int n_tickets=sc.nextInt(); 

            t.setTicketId(ticketid); 
            t.setPrice (price); 
            t.setAvailableTickets (availableTickets);

            System.out.println("Available tickets: "+availableTickets); 
            if(n_tickets<=availableTickets) 
            { 
                availableTickets-=n_tickets; 
                System.out.println("Total amount: "+t.calculateTicketCost(n_tickets)); 
                
                if(availableTickets==0) 
                { 
                    System.out.println("House full"); 
                    break; 
                } 
                else 
                    System.out.println("Available ticket after booking: "+availableTickets); 
                
            } 
            else 
                System.out.println("Tickets are not available"); 
        } 
    }
}