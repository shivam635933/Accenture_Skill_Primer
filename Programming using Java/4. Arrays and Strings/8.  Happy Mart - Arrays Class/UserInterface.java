import java.util.*; 
public class UserInterface 
{ 
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner(System.in); 
        // Fill the code here 
        ArrayList<Product> object = new ArrayList<>(); 
        SortById comp1=new SortById(); 
        SortByPrice comp2=new SortByPrice();

        System.out.println("Enter the products count"); 
        int count=sc.nextInt(); 
        
        if(count<1) 
        { 
            System.out.println("Invalid count"); 
            return; 
        }

        System.out.println("Enter Product details"); 
        for(int i=0;i<count;i++) 
        { 
            String productDetail=sc.next(); 
            String[] detail=productDetail.split(":");

            int productId=Integer.parseInt(detail[0]); 
            String productName=detail[1]; 
            double price=Double.parseDouble(detail[2]);

            Product products = new Product(productId, productName, price); 
            object.add(products); 
        } 

        System.out.println("1.Sort By Id\n2. Sort By Price");

        System.out.println("Enter your choice"); 
        int choice=sc.nextInt(); 
        
        if(choice==1) 
        { 
            Collections.sort(object, comp1); 
            System.out.println("After Sorting By Id"); 
        } 
        else if(choice==2) 
        { 
            Collections.sort(object, comp2); 
            System.out.println("After Sorting By Price"); 
        } 
        else 
        { 
            System.out.println("Invalid choice"); 
            return; 
        } 

        for (Product a:object) 
            System.out.println(a); 
    } 
}