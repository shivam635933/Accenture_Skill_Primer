public class Product 
{ 
    public int productId; 
    public String productName; 
    public double price; 

    //Include three argument constructor to initialize values 
    public Product (int productId, String productName, double price) 
    { 
        this.productId=productId; 
        this.productName=productName; 
        this.price price; 
    } 
    //This method should return the productId, productName and price seperated by whitespace 
    public String toString() 
    { 
        return productId+" "+productName+" "+price; 
    } 
}