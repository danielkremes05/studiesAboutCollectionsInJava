package collections.set_interfaces.searchInList.addressBookOne.Calender.Main;

import collections.set_interfaces.searchInList.addressBookOne.Calender.CalendarContacts;
import collections.set_interfaces.searchInList.addressBookOne.Calender.Contact;
import collections.set_interfaces.searchInList.addressBookOne.Calender.ContactBuilder;

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
