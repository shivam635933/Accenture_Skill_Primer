import java.util.Scanner; 
public class UserInterface 
{ 
    public static void main(String[] args) 
    { 
        Scanner sc=new Scanner(System.in); 
        
        System.out.println("Enter the ticket Id"); 
        long ticket= sc.nextLong(); 
        long original_ticket = ticket; 
        
        System.out.println("Enter the unlucky code"); 
        int code = sc.nextInt(); 
        
        int unluckyCount=-1; 
        while (ticket!=0) 
        { 
            if((ticket%10)==code) 
            unluckyCount++; 
            ticket/=10; 
        } 
        
        if (unluckyCount==-1) 
            System.out.println(original_ticket+" is lucky ticket"); 
        else if(unluckyCount>=2) 
            System.out.println(original_ticket+" is unlucky ticket"); 
        else 
            System.out.println(original_ticket+" is partially lucky"); 
    } 
}