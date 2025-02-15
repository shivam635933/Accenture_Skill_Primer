import java.util.Scanner; 
public class UserInterface { 
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner(System.in); 
        
        System.out.println("Enter the number"); 
        int num = sc.nextInt(); 
        
        int original_num = num; 
        int rev=1, temp=num; 
        int rev_num = 0; 
        String expand=""; 
        
        int count=0; 
        while(temp!=0) 
        { 
            count++; 
            rev*=10; 
            temp/=10; 
        } 

        rev/=10; 
        if(count==4) 
        { 
            while(num!=0) 
            { 
                rev_num += (num%10)*rev; 
                
                if((num%10)!=0)
                    expand += (num%10)*rev +"+"; 
                
                rev/=10; 
                num/=10; 
            } 

            expand = expand.substring(0,expand.length()-1); 

            System.out.println("Reversed number is "+rev_num); 
            System.out.println(expand); 
        } 
        else 
            System.out.println(original_num+" is an invalid number"); 
    }
}