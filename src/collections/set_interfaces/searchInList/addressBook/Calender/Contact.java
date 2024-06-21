package collections.set_interfaces.searchInList.addressBookOne.Calender;

import java.util.Objects;

public class Contact {
    private final String nameContact;
    private final String phoneNumber;

    public Contact (String nameContact, String phoneNumber) {
        this.nameContact = nameContact;
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber () {
        return phoneNumber;
    }

    public String getNameContact () {
        return nameContact;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return phoneNumber == contact.phoneNumber && Objects.equals(nameContact, contact.nameContact);
    }

    @Override
    public int hashCode () {
        return Objects.hash(nameContact, phoneNumber);
    }

}
