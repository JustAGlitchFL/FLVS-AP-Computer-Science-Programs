/**
 * Purpose: Test a merge sort
 * @author Aidan Procopio
 * @version 12/15/24
 */
public class Store {
    // insertion sort by name
    public static void sortName(Item[] inventory, boolean desc) {
        if (desc) {
            for (int i = 1; i < inventory.length; i++) {
                Item key = inventory[i];
                int j = i - 1;
                while (j >= 0 && inventory[j].getName().compareTo(key.getName()) < 0) {
                    inventory[j + 1] = inventory[j];
                    j--;
                }
                inventory[j + 1] = key;
            }
        } else {
            for (int i = 1; i < inventory.length; i++) {
                Item key = inventory[i];
                int j = i - 1;
                while (j >= 0 && inventory[j].getName().compareTo(key.getName()) > 0) {
                    inventory[j + 1] = inventory[j];
                    j--;
                }
                inventory[j + 1] = key;
            }
        }
    }

    //selection sort by item number
    public static void sortItemNumber(Item[] inventory, boolean desc) {
        if (desc) {
            for (int i = 0; i < inventory.length - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < inventory.length; j++) {
                    if (inventory[j].getItemNumber() > inventory[minIndex].getItemNumber()) {
                        minIndex = j;
                    }
                }
                Item temp = inventory[minIndex];
                inventory[minIndex] = inventory[i];
                inventory[i] = temp;
            }
        } else {
            for (int i = 0; i < inventory.length - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < inventory.length; j++) {
                    if (inventory[j].getItemNumber() < inventory[minIndex].getItemNumber()) {
                        minIndex = j;
                    }
                }
                Item temp = inventory[minIndex];
                inventory[minIndex] = inventory[i];
                inventory[i] = temp;
            }
        }
    }

    //insertion sort by price
    public static void sortPrice(Item[] inventory, boolean desc) {
        if (desc) {
            for (int i = 1; i < inventory.length; i++) {
                Item key = inventory[i];
                int j = i - 1;
                while (j >= 0 && inventory[j].getPrice() < key.getPrice()) {
                    inventory[j + 1] = inventory[j];
                    j--;
                }
                inventory[j + 1] = key;
            }
        } else {
            for (int i = 1; i < inventory.length; i++) {
                Item key = inventory[i];
                int j = i - 1;
                while (j >= 0 && inventory[j].getPrice() > key.getPrice()) {
                    inventory[j + 1] = inventory[j];
                    j--;
                }
                inventory[j + 1] = key;
            }
        }
    }

    //merge sort by quantity
    public static void sortQuantity(Item[] inventory, int low, int high){
        if (low == high) return;
        int mid = (low + high) / 2;
        sortQuantity(inventory, low, mid);
        sortQuantity(inventory, mid + 1, high);
        mergeQuantity(inventory, low, mid, high);
    }

    private static void mergeQuantity(Item[] inventory, int low, int mid, int high) {
        Item[] temp = new Item[high - low + 1];
        int i = low, j = mid + 1, n = 0;
        while (i <= mid || j <= high) {
            if (i>mid) {
                temp[n] = inventory[j];
                j++;
            } else if (j > high) {
                temp[n] = inventory[i];
                i++;
            } else if (inventory[i].getQuantity() < inventory[j].getQuantity()) {
                temp[n] = inventory[i];
                i++;
            } else {
                temp[n] = inventory[j];
                j++;
            }
            n++;
        }
        for (int k = low; k <= high; k++) {
            inventory[k] = temp[k - low];
        }
        
    }


    private static void printTable(Item[] inventory) {
        System.out.println("Name                           Item Number     Price     Quantity");
        System.out.println("-----------------------------------------------------------------");
        for (Item item : inventory) {
            System.out.println(item);
        }
    }
    public static void main(String[] args) {
        Item[] inventory = {
            new Item("ROG Zephyrus G14", 1, 1499.99, 5),
            new Item("MacBook Pro M4", 2, 1299.99, 3),
            new Item("Dell XPS 13", 3, 1199.99, 7),
            new Item("HP Spectre x360", 4, 999.99, 2),
            new Item("Lenovo ThinkPad X1 Carbon", 5, 1399.99, 4),
            new Item("Acer Aspire 5", 6, 599.99, 6),
            new Item("Microsoft Surface Laptop 4", 7, 1299.99, 1),
            new Item("Asus ZenBook Duo", 8, 1499.99, 8),
            new Item("Samsung Galaxy Book Pro", 9, 1199.99, 9),
            new Item("Microsoft Surface Pro 11", 10, 999.99, 10)
        };

        System.out.println("Unsorted Inventory:");
        printTable(inventory);

        System.out.println("\nSort by Name:");
        sortName(inventory, false);
        printTable(inventory);

        System.out.println("\nSort by Item Number descending:");
        sortItemNumber(inventory, true);
        printTable(inventory);

        System.out.println("\nSort by Price:");
        sortPrice(inventory, false);
        printTable(inventory);

        System.out.println("\nSort by Quantity:");
        sortQuantity(inventory, 0, inventory.length - 1);
        printTable(inventory);
    }
}
