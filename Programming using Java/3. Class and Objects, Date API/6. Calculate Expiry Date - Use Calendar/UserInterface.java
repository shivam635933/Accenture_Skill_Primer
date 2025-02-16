import java.util.Scanner; 
import java.util.Date; 
import java.util.Calendar; 
import java.text.SimpleDateFormat; 

public class UserInterface 
{ 
    public static void main(String[] args) 
    { 
        Scanner sc=new Scanner(System.in); 
        SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy"); 
        s.setLenient(false); 

        System.out.println("Enter the Manufacturing Date"); 
        String date = sc.next(); 
        Date d=null;

        try 
        { 
            d = s.parse(date); 
        } 
        catch(Exception e) 
        { 
            System.out.println(date+" is not a valid date"); 
            return; 
        } 

        System.out.println("Enter the Month"); 
        int month = sc.nextInt(); 
        
        Calendar c = Calendar.getInstance(); 
        c.setTime(d); 
        c.add(Calendar.MONTH, month); 
        
        Date expiry=c.getTime(); 
        
        String expiryDate = s.format(expiry); 
        System.out.println(expiryDate+" is the expiry date");
    }
}