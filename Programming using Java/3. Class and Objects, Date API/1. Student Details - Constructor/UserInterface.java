import java.util.Scanner;

public class UserInterface
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Student's Id:");
        int id = sc.nextInt();

        System.out.println("Enter Student's Name:");
        String name = sc.next();

        System.out.println("Enter Student's address:");
        String address = sc.next();

        Student s = null;
        String college="";
        while(true)
        {
            System.out.println("Whether the student is from NIT(Yes/No):");
            String input = sc.next();

            if(input.equalsIgnoreCase("yes")){
                s=new Student(id,name,address);
                break;
            }
            else if(check.equalsIgnoreCase("no")){
                    System.out.println("Enter the college name:");
                    college=sc.next();

                    s=new Student(id,name,address,college);
                    break;
            }
            else
                System.out.println("Wrong input");
        }
                   
            System.out.println("Student id:"+s.getStudentId());
            System.out.println("Student name:"+s.getStudentName());
            System.out.println("Address:"+s.getStudentAddress());
            System.out.println("College name:"+s.getCollegeName());
    }
}