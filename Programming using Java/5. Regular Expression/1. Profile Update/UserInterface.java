import java.util.Scanner; 
public class UserInterface 
{ 
    public static void main(String[] args) 
    { 
        Scanner sc=new Scanner(System.in); 
        //Fill code here 

        System.out.println("Enter your name"); 
        String name = sc.next();

        System.out.println("Enter your PAN number"); 
        String pan = sc.next(); 

        if(!pan.matches("[A-Z]{5}[0-9]{4}[A-Z]")) 
        { 
            System.out.println(pan+" is an invalid PAN number"); 
            return; 
        } 

        System.out.println("Enter your E-mail ID"); 
        String email=sc.next(); 
        
        if(!email.matches("[a-z]{5,10}@digitec.com")) 
        { 
            System.out.println("Invalid E-mail ID"); 
            return; 
        }

        System.out.println("Profile of "+name+" updated successfully"); 
    }
}