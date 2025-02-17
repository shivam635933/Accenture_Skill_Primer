import java.util.Scanner; 
import java.util.Arrays; 
public class UserInterface
{ 
    public static void main(String[] args)
    { 
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the array size"); 
        int size=sc.nextInt(); 

        if(size<=0) 
        { 
            System.out.println(size+" is an invalid array size"); 
            return; 
        } 
        else if(size%2!=0) 
        { 
            System.out.println(size+" is an odd number. Please enter even number"); 
            return; 
        } 

        int arr[]=new int[size];

        System.out.println("Enter the number"); 
        for(int i=0;i<size;i++) 
            arr[i]=sc.nextInt(); 

        Arrays.sort(arr);

        int max=Integer.MIN_VALUE; 
        for(int i=0;i<size/2;i++) 
        { 
            int sum=arr[i]+arr[size-i-1]; 
            if(sum>max) 
                max=sum; 
        } 
        System.out.println("The maximum number is "+max); 
    }
}