import java.util.Scanner; 
import java.text.SimpleDateFormat; 
public class UserInterface 
{ 
    public static void main(String[] args) 
    { 
        Scanner sc=new Scanner(System.in); 

        System.out.println("Enter the date"); 
        String date = sc.next(); 

        if(isValidDate(date)) 
            System.out.println(date+" is a valid date"); 
        else 
            System.out.println(date+" is not a valid date"); 
    } 
    public static boolean isValidDate(String date) 
    { 
        SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy"); 
        s.setLenient(false); 

        try 
        { 
            s.parse(date); 
            return true; 
        } 
        catch(Exception e) 
        { 
            return false; 
        }
    }
}