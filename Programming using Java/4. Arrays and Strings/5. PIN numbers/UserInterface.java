import java.util.Scanner; 
public class UserInterface
{ 
    public static boolean checkPin(int pin) 
    { 
        int count=0; 
        
        while(pin!=0) 
        { 
            count++; 
            pin/=10; 
        } 
        return count==4; 
    } 

    public static boolean isPrime(int n) 
    { 
        if(n<=1) 
            return false; 
        if(n!=2&&n%2==0) 
            return false; 
        
        for(int i=3;i<=Math.sqrt(n);i+=2) 
        { 
            if(n%i==0) 
                return false; 
        } 
        
        return true; 
    }

    public boolean isEven(int n)
    {
        return n%2==0;
    }

    public static void main(String[] args)
    { 
        Scanner sc=new Scanner(System.in); 
         
        System.out.println("Enter the total number of PIN numbers"); 
        int n_pin=sc.nextInt();

        if(n_pin<1) 
        { 
            System.out.println(n_pin+" is an invalid number"); 
            return; 
        } 

        int pin[]=new int[n_pin];

        System.out.println("Enter the PIN numbers"); 
        for(int i=0;i<n_pin;i++) 
        { 
            pin[i]=sc.nextInt(); 
            if(!checkPin(pin[i])) 
            { 
                System.out.println(pin[i]+" is an invalid PIN number"); 
            return; 
            } 
        } 
        
        boolean check = false; 
        
        for(int i=0;i<n_pin;i++)
        {
            int n=pin[i]; 
            
            if(!isPrime(n%10)) 
            { 
                n/=10; 
                if(isPrime(n%10)) 
                { 
                    n/=10; 
                    if(isEven (n%10)) 
                    { 
                        n/=10; 
                        if(!isEven (n%10)) 
                        { 
                            if(!check) 
                                System.out.println("Valid PIN numbers are"); 
                                
                            check=true; 
                            System.out.println(pin[i]); 
                        } 
                    } 
                }
            }
        } 
        if(!check) 
            System.out.println("All these "+n_pin+" numbers are not a valid PIN number");
    }
}