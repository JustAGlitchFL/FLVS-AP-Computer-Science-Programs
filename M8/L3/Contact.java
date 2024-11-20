package M8.L3;
/**
 * purpose: contact class
 * @author Aidan Procopio
 * @version 11/12/2024
 */
public class Contact {
    private String name;
    private String relation;
    private String birthday;
    private String phone;
    private String email;

    public Contact(String name, String relation, String birthday, String phone, String email) {
        this.name = name;
        this.relation = relation;
        this.birthday = birthday;
        this.phone = phone;
        this.email = email;
    }

    public String toString() {
        return String.format("%s, %s, %s, %s, %s", name, relation, birthday, phone, email);
    }

}
