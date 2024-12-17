/**
 * Item class for the store
 * @author Aidan Procopio
 * @version 12/15/24
 */
public class Item {
    private String name;
    private int itemNumber;
    private double price;
    private int quantity;

    public Item(String name, int itemNumber, double price, int quantity) {
        this.name = name;
        this.itemNumber = itemNumber;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getItemNumber() {
        return itemNumber;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String toString(){
        return String.format("%-40s %-5d $%-8.2f %8d", name, itemNumber, price, quantity);
    }
}
