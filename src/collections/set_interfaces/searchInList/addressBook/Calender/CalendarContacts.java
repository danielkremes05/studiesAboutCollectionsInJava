package collections.set_interfaces.searchInList.addressBookOne.Calender;

import java.util.HashSet;
import java.util.Set;

public class CalendarContacts {

    /* Create a class called ``AgendaContacts"`` which has a set of objects of type "Contact" as an attribute.
    Each contact has attributes such as name and phone number. Implement the following methods:
     */

    private final Set<Contact> contacts = new HashSet<>();

    public void searchByName (String name) {
        for (Contact value : contacts) {
            if (value.getNameContact().equalsIgnoreCase(name)) {
                System.out.println("Your are " + name + " your was founded in list");
            } else {
                System.out.println("Sorry you are " + name + ", your name not founded in list");
            }
        }
    }

    public void addContact (String name, String phoneNumber) {
        contacts.add(new Contact(name, phoneNumber));
    }

    public void displayContacts () {
        for (Contact value : contacts) {
            System.out.println("Name: " + value.getNameContact() + ", Phone Number " + value.getPhoneNumber());
        }
    }

    public void updateContactNumber (String name, String newNumber) {
        for (Contact value : contacts) {
            if (value.getNameContact().equalsIgnoreCase(name)) {
                contacts.remove(value);
                contacts.add(new Contact(name, newNumber));
            }
        }
    }

}
