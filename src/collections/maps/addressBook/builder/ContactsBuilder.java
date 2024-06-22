package collections.maps.addressBook.builder;

import collections.maps.addressBook.contacts.Contacts;

public class ContactsBuilder {
    private String name;
    private String phoneNumber;

    public ContactsBuilder getName (String name) {
        this.name = name;
        return this;
    }

    public ContactsBuilder getPhoneNumber (String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public Contacts creationContact () {
        return new Contacts(name, phoneNumber);
    }
}
