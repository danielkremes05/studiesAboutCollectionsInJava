package collections.maps.addressBook.contacts;

import java.util.HashMap;
import java.util.Map;

public class AgendaContacts {
    private Map<String, String> contacts = new HashMap<>();

    public void addContact (String name, String phone) {
        contacts.put(name, phone);
    }

    public void searchByName (String name) {
        boolean found = false;
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            if (entry.getKey().equalsIgnoreCase(name)) {
                System.out.println("Name: " + entry.getKey() + ", Phone: " + entry.getValue());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Name: " + name + " not found!");
        }
    }

    public void removeContact (String name) {
        String keyToRemove = null;
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            if (entry.getKey().equalsIgnoreCase(name)) {
                keyToRemove = entry.getKey();
                break;
            }
        }
        if (keyToRemove != null) {
            contacts.remove(keyToRemove);
            System.out.println("Contact " + name + " removed successfully.");
        } else {
            System.out.println("Contact " + name + " not found.");
        }
    }

    public void displayContacts () {
        contacts.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));
    }

}
