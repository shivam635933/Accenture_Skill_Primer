import java.util.Scanner; 
public class UserInterface { 
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner(System.in); 
    
        System.out.println("Enter the day"); 
        int day = sc.nextInt(); 
        
        if(day<=0||day>30) 
        { 
            System.out.println(day+" is invalid day"); 
            return; 
        } 

        int a=0,b=1; 
        for(int i=2;i<=day;i++) 
        { 
            int temp=b; 
            b = 2*b+a; 
            a=temp; 
        } 
        System.out.println("Number of eggs in "+day+"th day is "+b); 
    } 
}