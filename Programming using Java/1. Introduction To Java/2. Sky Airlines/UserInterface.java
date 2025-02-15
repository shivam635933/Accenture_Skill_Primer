import java.util.Scanner; 

public class UserInterface { 
    public static void main(String[] args) 
    { 
        Scanner sc= new Scanner(System.in); 
        System.out.println("Enter name"); 
        String name = sc.next(); 

        System.out.println("Enter source"); 
        String source = sc.next(); 

        System.out.println("Enter destination"); 
        String destination sc.next(); 
        
        System.out.println("Dear "+name+", welcome onboard with service from "+source+" to "+destination+". Thankyou for choosing Sky Airlines. Enjoy your flight."); 
    } 
}