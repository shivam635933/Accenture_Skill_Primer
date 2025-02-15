import java.util.Scanner; 
public class UserInterface{ 
    public static void main(String[] args){ 
        Scanner sc=new Scanner(System.in); 
    
        System.out.println("Enter the phone number"); 
        long number = sc.nextLong(); 
        
        int evencount=0, oddcount=0; 
        while(number!=0) 
        { 
            if((number%10)%2==0) 
                evencount += number%10; 
            else 
                oddcount += number%10; 
            number/=10; 
        } 

        if(evencount==oddcount) 
            System.out.println("Sum of odd and even are equal"); 
        else if(evencount>oddcount) 
            System.out.println("Sum of even is greater than sum of odd"); 
        else 
            System.out.println("Sum of odd is greater than sum of even"); 
    }
}