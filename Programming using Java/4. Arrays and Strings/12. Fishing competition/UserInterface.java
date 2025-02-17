import java.util.Scanner; 
public class UserInterface 
{ 
    public static void main(String args[]) 
    { 
        Scanner sc =new Scanner(System.in); 
        //Fill the code 
        System.out.println("Enter the details"); 
        String input = sc.next(); 
        
        String details[] = input.split(":"); 
        String name = details[0]; 
        int age = Integer.parseInt(details[1]);

        if(age<18) 
        { 
            System.out.println(age+" is an invalid age"); 
            return; 
        }   

        int bFish=Integer.parseInt(details[2]); 
        if(bFish<0) 
        { 
            System.out.println(bFish+" is an invalid input"); 
            return; 
        } 
        
        int mFish-Integer.parseInt(details[3]); 
        if(mFish<0)
        { 
            System.out.println(mFish+" is an invalid input"); 
            return; 
        } 
        
        int sFish-Integer.parseInt(details[4]); 
        if(sFish<0) 
        { 
            System.out.println(sFish+" is an invalid input"); 
            return;
        } 
         
        System.out.println(name+" scored "+(bFish*10+ mFish*6+ sFish*3)+" points"); 
    } 
}