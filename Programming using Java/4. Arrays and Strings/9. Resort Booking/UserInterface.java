import java.util.Scanner; 
public class UserInterface 
{ 
    public static void main(String args[]) 
    { 
    //fill the code here 
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the customer details"); 
        String input = sc.next();

        String[] details=input.split(":"); 
        String name=details[0];

        int adult-Integer.parseInt(details[1]); 
        int child-Integer.parseInt(details[2]); 
        int day Integer.parseInt(details[3]); 

        if(adult<0) 
            System.out.println("Invalid input for number of adults"); 
        else if(child<0) 
            System.out.println("Invalid input for number of children"); 
        else if(day<1) 
            System.out.println("Invalid input for number of days"); 
        else 
            System.out.println(name+" your booking is confirmed and the total cost is "+((adult*1000)+(child*650))*day); 
    } 
}