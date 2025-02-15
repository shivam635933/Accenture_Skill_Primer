import java.util.Scanner; 
public class UserInterface { 
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner(System.in); 
        
        System.out.println("Enter weight in kg"); 
        double weight = sc.nextDouble(); 
        
        System.out.println("Enter height in cm"); 
        double height = sc.nextDouble(); 
        
        double BMI = weight/Math.pow(height/100,2); 
        System.out.printf("Your BMI is %.2f. ",BMI); 

        if(BMI>=25f) 
        { 
            System.out.println("You are overweight"); 
            double reduce = Math.abs(BMI-25); 
            System.out.printf("Reduce %.2f kg to be fit%n", reduce); 
        } 
        else if(BMI>=18.5f) 
        { 
            System.out.println("You are fit and healthy"); 
        } 
        else 
        { 
            System.out.println("You are underweight"); 
            double gain = Math.abs(18.5-BMI); 
            System.out.printf("Gain %.2f kg to be fit%n", gain);
        }
    }
}