import java.util.Scanner; 
public class UserInterface { 
    public static void main(String args[]) 
    { 
        Scanner sc=new Scanner(System.in); 
        
        System.out.println("Enter the length of the room(in m)"); 
        float 1 = sc.nextFloat(); 
        if(1<=0) 
        { 
            System.out.println("Invalid length"); 
            return; 
        } 

        System.out.println("Enter the breadth of the room(in m)"); 
        float b = sc.nextFloat(); 
        if(b<=0) 
        { 
            System.out.println("Invalid breadth"); 
            return; 
        } 
        
        System.out.println("Enter the plant area of a single plant (in cm2)"); 
        float p_area = sc.nextFloat(); 
        if(p_area<=0) 
        { 
            System.out.println("Invalid plant area"); 
            return;
        }

        float p_oxygen = t_plant*(float)0.9; 
        System.out.println("Total number of plants is "+t_plant); 
        System.out.printf("Total oxygen production is %.2f litres", p_oxygen); 
    } 
}