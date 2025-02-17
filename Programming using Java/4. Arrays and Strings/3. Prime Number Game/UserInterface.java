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

    public static void main(String[]args) 
    { 
        Scanner sc=new Scanner(System.in); 
        
        System.out.println("Enter the size of first array"); 
        int size1=sc.nextInt(); 
        
        if(size1<=0) 
        { 
            System.out.println(size1+" is an invalid array size"); 
            return;
        }
        int arr1[]=new int[size1]; 
        int arr3[]=new int[size1];

        System.out.println("Enter the array elements"); 
        for(int i=0;i<size1;i++) 
        { 
            arr1[i]=sc.nextInt();

            if(arr1[i]<0) 
            { 
                System.out.println(arr1[i]+" is an invalid input"); 
                return; 
            } 

            arr3[i]=arr1[i]; 
        } 

        System.out.println("Enter the size of second array"); 
        int size2=sc.nextInt();

        if(size2<=0) 
        { 
            System.out.println(size2+" is an invalid array size"); 
            return; 
        } 
        if(size1!=size2) 
        { 
            System.out.println("Both array size is different"); 
            return; 
        }

        int arr2[]=new int[size2];

        System.out.println("Enter the array elements"); 
        int sum=0; 
        for(int i=0;i<size2;i++) 
        { 
            arr2[i]=sc.nextInt(); 
            
            if(arr2[i]<0) 
            { 
                System.out.println(arr2[i]+" is an invalid input"); 
                return; 
            }

            arr3[i]+=arr2[i]; 
            sum += arr3[i]%10; 
        }

        if(isPrime(sum)) 
            System.out.println(sum+" is a prime number"); 
        else 
            System.out.println(sum+" is not a prime number"); 
    }
}