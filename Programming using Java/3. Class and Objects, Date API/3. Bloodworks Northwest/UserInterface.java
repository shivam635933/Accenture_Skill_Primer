import java.util.Scanner; 
public class UserInterface 
{ 
    public static void main(String args[]) 
    { 
        Scanner sc =new Scanner(System.in); 

        System.out.println("Enter the name"); 
        String name=sc.next(); 

        System.out.println("Enter the age"); 
        int age=sc.nextInt(); 

        System.out.println("Enter the gender"); 
        String gender=sc.next(); 

        sc=new Scanner(System.in); 
        System.out.println("Enter the blood group"); 
        String bloodGroup=sc.nextLine(); 

        System.out.println("Enter the phone no"); 
        long phoneNumber=sc.nextLong(); 
        
        DonorDetails d = new DonorDetails (name, age, gender, bloodGroup, phoneNumber); 
        System.out.println("Name:"+d.getName()); 
        System.out.println("Age:"+d.getAge()); 
        System.out.println("Gender:"+d.getGender()); 
        System.out.println("Blood group: "+d.getBlood Group()); 
        System.out.println("Phone no: "+d.getPhoneNumber());
    }
}