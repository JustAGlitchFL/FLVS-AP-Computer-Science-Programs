package M8.L3;
/**
 * purpose: contact list example
 * @author Aidan Procopio
 * @version 11/12/2024
 */
public class ContactList {
    
    public static void printTable(Contact[] contact) {
        System.out.println("Name\t\tRelation\tBirthday\tPhone\t\t\t\tEmail");
        System.out.println("-------------------------------------------------------------------------------------");
        for (Contact c : contact) {
            System.out.println(c);
        }
    }
    public static void printHeader() {
        System.out.println("Name\t\tRelation\tBirthday\tPhone\t\t\t\tEmail");
        System.out.println("-------------------------------------------------------------------------------------");
    }
    //insertion sorts
    public static void sortByName(Contact[] contact) {
        for (int i = 1; i < contact.length; i++) {
            Contact key = contact[i];
            int j = i - 1;
            while (j >= 0 && contact[j].getName().compareTo(key.getName()) > 0) {
                contact[j + 1] = contact[j];
                j = j - 1;
            }
            contact[j + 1] = key;
        }
    }
    public static void sortByRelation(Contact[] contact) {
        for (int i = 1; i < contact.length; i++) {
            Contact key = contact[i];
            int j = i - 1;
            while (j >= 0 && contact[j].getRelation().compareTo(key.getRelation()) > 0) {
                contact[j + 1] = contact[j];
                j = j - 1;
            }
            contact[j + 1] = key;
        }
    }
    //binary searches
    public static int binarySearchName(Contact[] contact, String name) {
        printHeader();
        sortByName(contact);
        int high = contact.length;
        int low = -1;
        int probe;
        while (high - low > 1) {
            probe = (high + low) / 2;
            if (contact[probe].getName().compareTo(name) > 0) {
                high = probe;
            } else {
                low = probe;
            }
        }
        if ((low >= 0) && (contact[low].getName().compareTo(name) == 0)) {
            return low;
        } else {
            return -1;
        }
    }
    public static int binarySearchRelation(Contact[] contact, String relation) {
        printHeader();
        sortByRelation(contact);
        int high = contact.length;
        int low = -1;
        int probe;
        while (high - low > 1) {
            probe = (high + low) / 2;
            if (contact[probe].getRelation().compareTo(relation) > 0) {
                high = probe;
            } else {
                low = probe;
            }
        }
        if ((low >= 0) && (contact[low].getRelation().compareTo(relation) == 0)) {
            return low;
        } else {
            return -1;
        }
    }
    //linear print to print any others of that relation from first found (unnessecary for name as it is unique)
    public static void linearPrintRelation(Contact[] contact, int low, String relation) {
        if (low == -1) {
            System.out.println("Relation not found");
            return;
        }
        int i;
        int start = low;
        int end = low;

        //verify starting point of matches
        i = low-1;
        while (i >= 0 && contact[i].getRelation().compareTo(relation) == 0) {
            start = i;
            i--;
        }
        //find end of matches
        i = low+1;
        while (i < contact.length && contact[i].getRelation().compareTo(relation) == 0) {
            end = i;
            i++;
        }
        //print all matches
        for (i = start; i <= end; i++) {
            System.out.println(contact[i]);
        }

    }
    //sequential searches for everything else
    public static void searchBirthMonth(Contact[] contact, String month) {
        printHeader();
        boolean found = false;
        for (Contact c : contact) {
            if (c.getBirthday().substring(0, 3).equals(month)) {
                System.out.println(c);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No contacts found with that birth month");
        }
    }
    public static void searchPhone(Contact[] contact, String phone) {
        printHeader();
        boolean found = false;
        for (Contact c : contact) {
            if (c.getPhone().equals(phone)) {
                System.out.println(c);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No contacts found with that phone number");
        }
    }
    public static void searchEmail(Contact[] contact, String email) {
        printHeader();
        boolean found = false;
        for (Contact c : contact) {
            if (c.getEmail().equals(email)) {
                System.out.println(c);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No contacts found with that email");
        }
    }
    public static void main(String[] args) {
        Contact[] contact = {
            new Contact("Jason Li", "Friend", "Sep 3", "904-908-0953", "jasonli@mail.com"),
            new Contact("Chase Kennedy", "Friend", "Feb 17", "904-468-2834", "chase.kennedy@mail.com"),
            new Contact("Linda Maberry", "Mother", "May 23", "904-234-2345", "lindamaberry@mail.com"),
            new Contact("Mark Procopio", "Father", "Aug 15", "904-123-4567", "mprocopio@mail.com"),
            new Contact("Sarah Thompson", "Sister", "Nov 30", "904-987-6543", "sarah.thompson@mail.com"),
            new Contact("Emily Davis", "Friend", "Apr 22", "904-876-5432", "emily.davis@mail.com"),
            new Contact("John Chau", "Friend", "Jun 18", "904-765-4321", "john.chau@mail.com"),
            new Contact("Sophia Brown", "Cousin", "Mar 12", "904-654-3210", "sophia.brown@mail.com"),
            new Contact("James Wilson", "Uncle", "Jul 25", "904-543-2109", "james.wilson@mail.com"),
            new Contact("Olivia Garcia", "Aunt", "Oct 5", "904-432-1098", "olivia.garcia@mail.com")
        };
        System.out.println("Original Table");
        printTable(contact);
        System.out.println("\nSearch by Name: Jason Li");
        int index = binarySearchName(contact, "Jason Li");
        if (index != -1) {
            System.out.println(contact[index]);
        } else {
            System.out.println("Name not found");
        }
        System.out.println("\nSearch for name: Thomas Lowry");
        index = binarySearchName(contact, "Thomas Lowry");
        if (index != -1) {
            System.out.println(contact[index]);
        } else {
            System.out.println("Name not found");
        }
        System.out.println("\nSearch by Relation: Friend");
        linearPrintRelation(contact, binarySearchRelation(contact, "Friend"), "Friend");
        System.out.println("\nSearch by Relation: Coworker");
        linearPrintRelation(contact, binarySearchRelation(contact, "Coworker"), "Coworker");
        System.out.println("\nSearch by Birth Month: Jan");
        searchBirthMonth(contact, "Jan");
        System.out.println("\nSearch by Birth Month: Mar");
        searchBirthMonth(contact, "Mar");
        System.out.println("\nSearch by Phone: 904-543-2109");
        searchPhone(contact, "904-543-2109");
        System.out.println("\nSearch by Phone: 904-000-0000");
        searchPhone(contact, "904-000-0000");
        System.out.println("\nSearch by Email: john.chau@mail.com");
        searchEmail(contact, "john.chau@mail.com");
        System.out.println("\nSearch by Email: thomas.lowry@mail.com");
        searchEmail(contact, "thomas.lowry@mail.com");


        



    }

}

