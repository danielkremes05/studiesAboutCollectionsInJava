package collections.maps.addressBook.main;

import collections.maps.addressBook.builder.ContactsBuilder;
import collections.maps.addressBook.contacts.AgendaContacts;
import collections.maps.addressBook.contacts.Contacts;

import javax.swing.*;

public class Main {
    public static void main (String[] args) {

        boolean loopCondition = true;
        AgendaContacts agendaContacts = new AgendaContacts();

        while (loopCondition) {

            String nameContact = JOptionPane.showInputDialog("Type it your name please ?");
            String numberPhone = JOptionPane.showInputDialog("Type it your phone number ?");

            Contacts contacts = new ContactsBuilder()
                    .getName(nameContact)
                    .getPhoneNumber(numberPhone)
                    .creationContact();

            agendaContacts.addContact(contacts.getName(), contacts.getPhoneNumber());

            String option = JOptionPane.showInputDialog("Would you like to continue (Y: yes) N (not)");

            if (option.equalsIgnoreCase("N")) {
                break;
            }

        }

        agendaContacts.displayContacts();

    }
}
