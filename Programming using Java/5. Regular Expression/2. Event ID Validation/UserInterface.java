import java.util.Scanner; 
public class UserInterface 
{ 
    public static void main(String[] args) 
    { 
        Scanner sc=new Scanner(System.in); 
        //Fill code here 
        System.out.println("Enter your name"); 
        String name = sc.next(); 

        System.out.println("Enter your ID"); 
        String id = sc.next();

        if(lid.matches("SPC[0-9]{3}(0[1-9]|1[0-2]) [AP]M")) 
        {
            System.out.println(id+" is an Invalid ID"); 
            return; 
        } 
         
        int seat_number=Integer.parseInt(id.substring(3,6)); 
        String start = Integer.parseInt(id.substring(6,8))+id.substring(id.length()-2);
         
        System.out.println("Hi "+name+" your seat number is "+seat_number+" and the event starts at "+start); 
    } 
}