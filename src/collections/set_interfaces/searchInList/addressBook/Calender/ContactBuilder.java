package collections.set_interfaces.searchInList.addressBookOne.Calender;

public class ContactBuilder {
    private String nameContact;
    private String phoneNumber;

    public ContactBuilder phoneNumber (String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public ContactBuilder nameContact (String nameContact) {
        this.nameContact = nameContact;
        return this;
    }

    public Contact creationContact () {
        return new Contact(nameContact, phoneNumber);
    }

}
