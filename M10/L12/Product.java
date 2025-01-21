public class Product
{
   private String productID;
   private double price;

   public Product(String productID, double price){
      //implementation not shown
   }

   public boolean canReplace(Product p){
        if (p.productID.compareTo(this.productID) > 0){
            if (p.price > this.price){
            return true;
            }
        }
        return false;
   }

   //other instance variables, constructors and methods are not shown
}