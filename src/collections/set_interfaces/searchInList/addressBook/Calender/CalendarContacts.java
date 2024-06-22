package collections.set_interfaces.searchInList.addressBook.Calender;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CalendarContacts {

    private final Set<Contact> contacts = new HashSet<>();

    public void searchByName (String name) {
        boolean found = false;
        for (Contact value : contacts) {
            if (value.getNameContact().equalsIgnoreCase(name)) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("You are " + name + ". Your name was found in the list.");
        } else {
            System.out.println("Sorry, you are " + name + ". Your name was not found in the list.");
        }
    }

    public void addContact (String name, String phoneNumber) {
        contacts.add(new Contact(name, phoneNumber));
    }

    public void displayContacts () {
        for (Contact value : contacts) {
            System.out.println("Name: " + value.getNameContact() + ", Phone Number: " + value.getPhoneNumber());
        }
    }

    public void updateContactNumber (String name, String newNumber) {
        Iterator<Contact> iterator = contacts.iterator();
        boolean updated = false;
        while (iterator.hasNext()) {
            Contact value = iterator.next();
            if (value.getNameContact().equalsIgnoreCase(name)) {
                iterator.remove();
                contacts.add(new Contact(name, newNumber));
                updated = true;
                break;
            }
        }
        if (updated) {
            System.out.println("Contact number for " + name + " updated to " + newNumber);
        } else {
            System.out.println("Contact with name " + name + " not found.");
        }
    }
}
