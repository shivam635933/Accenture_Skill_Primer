import java.util.*; 
public class UserInterface
{ 
    public static void main(String[] args)
    { 
        Scanner sc=new Scanner(System.in); 
        //Fill the code here 
        System.out.println("Enter the city name"); 
        String name=sc.next();

        HashSet<String> cities=new HashSet<>();

        cities.add("chennai"); 
        cities.add("coimbatore"); 
        cities.add("erode"); 
        cities.add("karur"); 
        cities.add("madurai"); 
        cities.add("hyderabad"); 
        cities.add("salem"); 
        cities.add("bangalore"); 
        cities.add("delhi"); 
        cities.add("agra");

        if(cities.contains (name.toLowerCase())) 
            System.out.println("Bus for "+name+" is available"); 
        else 
            System.out.println("Bus for "+name+" is not available"); 
    } 
}