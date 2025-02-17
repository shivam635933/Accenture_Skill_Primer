import java.util.Scanner; 
public class UserInterface 
{ 
    public static void main(String[] args)
    { 
        Scanner sc=new Scanner(System.in); 
        
        System.out.println("Enter the first string"); 
        String word=sc.nextLine(); 

        System.out.println("Enter the second string"); 
        String word1=sc.nextLine();

        String output=new String()
        ; 
        if(word.length()!=word1.length()) 
            System.out.println("Length of the strings "+word+" and "+word1+" does not match"); 
        else if(!(word.matches("[a-zA-z! ]+")) && ! (word1.matches("[a-zA-z! ]+"))) 
            System.out.println(word+" and "+word1+" contains invalid symbols"); 
        else if(!(word.matches("[a-zA-z! ]+"))) 
            System.out.println(word+" contains invalid symbols"); 
        else if(!(word1.matches("[a-zA-z! ]+"))) 
            System.out.println(word1+" contains invalid symbols"); 
        else 
        { 
            for(int i=0;i<word.length();i++) 
            { 
                if(word.charAt(i)=='!')  
                    output += word1.charAt(i); 
                else
                    output += word.charAt(i);
            }

            System.out.println(output);
        }
    }
}