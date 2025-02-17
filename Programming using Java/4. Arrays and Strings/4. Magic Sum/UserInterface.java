import java.util.Scanner; 
public class UserInterface 
{ 
    public static boolean isPrime(int n) 
    { 
        if(n<=1) 
            return false; 
        if(n==2) 
            return true; 
        if(n%2==0) 
            return false;

        for(int i=3;i<=Math.sqrt(n);i+=2) 
        { 
            if(n%i==0) 
            return false; 
        } 
        return true; 
    }

    public static int generateConsecutive(int n) 
    { 
        int sumConsecutive=0;

        for(int i=2;i<n;i++) 
        { 
            if(isPrime(i)) 
            { 
                if (sumConsecutive<n) 
                    sumConsecutive+=i; 
                else 
                    break; 
            } 
        }

        return sumConsecutive; 
    }

    public static void main(String[] args)
    { 
        Scanner sc=new Scanner(System.in); 
        
        System.out.println("Enter the array size"); 
        int size=sc.nextInt(); 

        if(size<1 || size>5) 
        { 
            System.out.println(size+" is an invalid array size"); 
            return;
        } 
        
        int numCheck[]=new int[size];

        System.out.println("Enter the numbers"); 
        for(int i=0;i<size;i++) 
        { 
            numCheck[i]=sc.nextInt(); 
            if(numCheck[i]<1 || numCheck[i]>99) 
            { 
                System.out.println(numCheck[i]+" is an invalid input"); 
            return; 
            } 
        }

        boolean check=false; 
        for(int i=0;i<size;i++) 
        {
            if(isPrime(numCheck[i])) 
            { 
                if (generateConsecutive (numCheck[i])==numCheck[i]) 
                {    
                    if(!check) 
                        System.out.println("The sum of prime numbers is"); 
                    
                    check=true; 
                    System.out.println(numCheck[i]); 
                } 
            } 
        } 
        if(!check) 
            System.out.println("The "+size+" numbers are not sum of prime numbers");
    }
}