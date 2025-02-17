import java.util.Scanner; 
public class UserInterface 
{ 
    public static void main(String args[]) 
    { 
        Scanner sc =new Scanner(System.in); 
         
        System.out.println("Enter the sentence"); 
        String s = sc.nextLine();

        if(!s.matches("[a-zA-Z]+")) 
        { 
            System.out.println(s+" is an invalid sentence"); 
            return; 
        }

        String details[]=s.split(" "); 
        if(details.length<3) 
        { 
            System.out.println("Invalid Length"); 
            return; 
        }

        int lastindex = s.lastIndexOf(''); 
        int firstindex = s.indexOf(''); 
        String output = s.substring(lastindex+1);

        while(lastindex>=firstindex) 
        { 
            output +=s.charAt(lastindex); 
            lastindex--; 
        }
         
        output += s.substring(0, firstindex); 
        System.out.println(output); 
    } 
}