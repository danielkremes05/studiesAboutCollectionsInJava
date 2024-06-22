package collections.set_interfaces.searchInList.addressBook.Main;

import collections.set_interfaces.searchInList.addressBook.Calender.CalendarContacts;
import collections.set_interfaces.searchInList.addressBook.Calender.Contact;
import collections.set_interfaces.searchInList.addressBook.Calender.ContactBuilder;

public class Main {
    public static void main (String[] args) {
        Contact contact = new ContactBuilder()
                .nameContact("Daniel")
                .phoneNumber("4299716528")
                .creationContact();

        CalendarContacts calendarContacts = new CalendarContacts();

        calendarContacts.addContact(contact.getNameContact(), contact.getPhoneNumber());

        calendarContacts.displayContacts();

        calendarContacts.searchByName("Renato");

        calendarContacts.updateContactNumber("Daniel", "5542999716528");

        calendarContacts.displayContacts();
    }
}
