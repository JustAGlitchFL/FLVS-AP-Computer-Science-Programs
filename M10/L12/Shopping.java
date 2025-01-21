import java.util.ArrayList;
public class Shopping{

    /*there may be other instance variables, constructors and methods not shown*/
 
    public static final int REORDER=4;
 
    public ArrayList <Grocery> addGroc(Grocery[] groc){
        ArrayList <Grocery> shoppingList = new ArrayList <Grocery>();
        for (Grocery i : groc){
            if (i.getQtyOnHand() < REORDER){
                shoppingList.add(i);
            }
        }
        return shoppingList;
    }
 
 
     public int totalQty(ArrayList <Grocery> shoppingList, String c){
        int total = 0;
        for (Grocery i : shoppingList){
            if (i.getCategory().equals(c)){
                total += i.getQtyOnHand();
            }
        }
        return total;
    }
 
 }