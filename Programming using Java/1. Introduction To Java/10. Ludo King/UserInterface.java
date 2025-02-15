import java.util.Scanner; 
public class UserInterface 
{ 
    public static void main(String[] args) 
    { 
        Scanner sc=new Scanner(System.in); 
 
        System.out.println("Enter Alex points"); 
        int a = sc.nextInt(); 
        if(a>50 || a<0) 
        { 
            System.out.println(a+" is an invalid number"); 
            return; 
        }

        System.out.println("Enter Nikil points"); 
        int n=sc.nextInt(); 
        if(n>50 || n<0) 
        { 
            System.out.println(n+" is an invalid number"); 
            return; 
        } 

        System.out.println("Enter Sam points"); 
        int s=sc.nextInt();
        if(s>50 || s<0) 
        { 
            System.out.println(s+" is an invalid number"); 
            return; 
        } 

        if(a==n||n==s ||a==s) 
        { 
            System.out.println("The game is a tie"); 
            return; 
        }

        if(a>n) 
        { 
            if(a>s) 
                System.out.println("Alex scored "+a+" points and won the game"); 
            else 
                System.out.println("Sam scored "+s+" points and won the game"); 
        } 
        else if(n>s) 
            System.out.println("Nikil scored "+n+" points and won the game"); 
        else 
            System.out.println("Sam scored "+s+" points and won the game"); 
    } 
}