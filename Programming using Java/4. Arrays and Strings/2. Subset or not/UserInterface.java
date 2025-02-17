import java.util.*;

public class UserInterface
{ 
    public static void main(String[] args)
    { 
        Scanner sc=new Scanner(System.in); 
        
        System.out.println("Enter the first array size"); 
        int size1=sc.nextInt(); 

        if(size1<=0) 
        { 
            System.out.println(size1+" is an invalid array size"); 
            return; 
        }

        int[] arr1=new int[size1]; 
        
        System.out.println("Enter the numbers"); 
        for(int i=0;i<size1;i++) 
            arr1[i]=sc.nextInt();

        System.out.println("Enter the second array size"); 
        int size2=sc.nextInt(); 
        
        if(size2<=0) 
        { 
            System.out.println(size2+" is an invalid array size"); 
            return;
        } 
        else if(sizel<size2) 
        {
            System.out.println(size2+" is an invalid size as it is greater than first array size "+size1); 
            return;
        } 
        
        int[] arr2=new int[size2];

        System.out.println("Enter the numbers"); 
        for(int i=0;i<size2;i++) 
            arr2[i]=sc.nextInt();

        Arrays.sort(arr1); 
        Arrays.sort(arr2); 

        int i=0,j=0; 
        boolean isSubset=true; 
        while(i<size1&&j<size2) 
        { 
            if(arr1[i]==arr2[j]) 
            { 
                i++;
                j++; 
            } 
            else if(arr1[i]<arr2[j]) 
                i++; 
            else 
            { 
                isSubset=false; 
                break; 
            } 
        }

        if(isSubset) 
            System.out.println("Array2 of size "+size2+" is a subset of array1"); 
        else 
            System.out.println("Array2 of size "+size2+" is not a subset of array1"); 
    }
}