// Don't Change the Structure 
import java.util.Scanner; 
public class UserInterface 
{ 
    public static void main(String args[]) 
    { 
        Scanner sc =new Scanner(System.in); 
        //Call the addition method with two arguments 10,15 System.out.println("Total "+addition (10, 15)); 
        System.out.println("Total "+addition(10, 15));
        
        //Call the addition method with three arguments 10,20,30 System.out.println("Total "+addition (10, 20, 30)); 
        System.out.println("Total "+addition(10, 20, 30));

        //Call the addition method with six arguments 10,30,60,100,5,15 System.out.println("Total "+addition (10, 30, 60, 100, 5, 15)); 
        System.out.println("Total "+addition(10, 30, 60, 100, 5, 15));
    } 
    //Include the public static int addition(int... a) method public static int addition(int... a) 
    public static int addition(int... a)
    { 
        System.out.println("Number of arguments is "+a.length); 
        
        int sum=0; 
        for(int num:a) 
            sum+=num; 
        
        return sum;
    }
}