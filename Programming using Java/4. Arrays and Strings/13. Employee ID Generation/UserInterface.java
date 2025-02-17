import java.util.*; 
public class UserInterface 
{ 
    public static void main(String args[]) 
    { 
        Scanner sc =new Scanner(System.in);
        HashMap<String, String> team = new HashMap<>();  
        //Fill the code 
        System.out.println("Enter the training id"); 
        String tId = sc.next(); 

        team.put("01", "LP"); 
        team.put("02", "TA"); 
        team.put("03", "CT"); 
        team.put("04", "PT"); 
        team.put("05","TT");

        String year = tId.substring(0,4); 
        String t=tId.substring(4,6); 
        String roll =tId.substring(tId.length()-3); 

        if(tId.length()!=9) 
        { 
            System.out.println(tId+" is an invalid training id"); 
            return; 
        }

        else if(!year.equals("2021"))
        {
            System.out.println(year+" is an invalid year"); 
            return; 
        } 
         
        else if(!team.containsKey(t)) 
        { 
            System.out.println(t+" is an invalid team code"); 
            return;
        } 
         
        else if(!(roll.matches("[0-9]+") && Integer.parseInt(roll)>=1 && Integer.parseInt(roll)<=999)) 
        { 
            System.out.println(roll+" is an invalid roll number"); 
            return; 
        }

        String eId = "SIET"+team.get(t)+roll; 
        System.out.println("Employee Id: "+eId); 
    } 
}