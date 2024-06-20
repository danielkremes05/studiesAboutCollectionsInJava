package collections.set_interfaces.basicOperationsWithSet.SetOfGuests.main;

import collections.set_interfaces.basicOperationsWithSet.SetOfGuests.guests.Guest;
import collections.set_interfaces.basicOperationsWithSet.SetOfGuests.guests.GuestBuilder;
import collections.set_interfaces.basicOperationsWithSet.SetOfGuests.guests.GuestSet;

import java.util.ArrayList;
import java.util.List;

/**
 * Main class to demonstrate usage of Guest, GuestBuilder, and GuestSet classes.
 */
public class Main {

    public static void main(String[] args) {

        // Create a list to store GuestSet instances
        List<GuestSet> guestStore = new ArrayList<>();

        // Create a Guest using GuestBuilder
        Guest guest = new GuestBuilder()
                .nameGuest("Daniel")
                .invitedCode(400)
                .creationGuest();

        // Create a new GuestSet instance
        GuestSet guestSet = new GuestSet();

        // Add the guest to the guestSet
        guestSet.addGuest(guest.getNameGuest(), guest.getInvitedCode());

        // Add guestSet to guestStore
        guestStore.add(guestSet);

        // Display guests in guestSet
        guestSet.displayGuests();

        // Uncomment the following lines to test additional functionality:

        // Count guests in guestSet
        // guestSet.countGuests();

        // Remove guest by invitation code (e.g., 400)
        // guestSet.removeGuestByInvitationCode(400);

        // Display guests in guestSet after removal
        // guestSet.displayGuests();

        // Count guests in guestSet after removal
        // guestSet.countGuests();
    }
}
