import java.util.Scanner; 
public class UserInterface
{


    public static void main(String[] args)
    { 
        Scanner sc=new Scanner(System.in); 
        //Fill code here 

        System.out.println("Generate your password"); 
        String password=sc.next(); 

        String pattern = "(?=.*[A-Z]) (?=.*[a-z]) (?=.*[@$*#]) [A-Za-z0-9@$*#]{6,12}"; 

        if(Ipassword.matches(pattern)) 
        { 
            System.out.println(password+" is an invalid password"); 
            return; 
        } 

        int lowerCase=0, upperCase=0, digit=0, special=0;

        for(char c:password.toCharArray())
        { 
            if(Character.isLowerCase(c)) 
                lowerCase++; 
            else if(Character.isUpperCase(c)) 
                upperCase++; 
            else if (Character.isDigit(c)) 
                digit++; 
            else 
                special++; 
        } 
        System.out.println("The generated password "+password+" is valid and has "+lowerCase+" lowercase alphabet "+upperCase+" uppercase alphabet "+special+" special character "+digit+" digit");  
    }
}