package M8.L3;
/**
 * purpose: contact list example
 * @author Aidan Procopio
 * @version 11/12/2024
 */
public class ContactList {
    Contact[] contact = {
        new Contact("Jason Li", "Friend", "Sep 3", "904-908-0953", "jasonli@mail.com"),
        new Contact("Chase Kennedy", "Friend", "Feb 17", "904-468-2834", "chase.kennedy@mail.com"),
        new Contact("Linda Maberry", "Mother", "May 23", "904-234-2345", "lindamaberry@mail.com"),
        new Contact("Michael Johnson", "Father", "Aug 15", "904-123-4567", "michael.johnson@mail.com"),
        new Contact("Sarah Thompson", "Sister", "Nov 30", "904-987-6543", "sarah.thompson@mail.com"),
        new Contact("Emily Davis", "Friend", "Apr 22", "904-876-5432", "emily.davis@mail.com"),
        new Contact("John Chau", "Friend", "Jun 18", "904-765-4321", "john.chau@mail.com"),
        new Contact("Sophia Brown", "Cousin", "Mar 12", "904-654-3210", "sophia.brown@mail.com"),
        new Contact("James Wilson", "Uncle", "Jul 25", "904-543-2109", "james.wilson@mail.com"),
        new Contact("Olivia Garcia", "Aunt", "Oct 5", "904-432-1098", "olivia.garcia@mail.com")
    };
    public static void printTable(Contact[] contact) {
        System.out.println("Name\t\tRelation\tBirthday\tPhone\t\t\tEmail");
        System.out.println("---------------------------------------------------------------");
        for (Contact c : contact) {
            System.out.println(c);
        }
    }
}

