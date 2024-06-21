package collections.set_interfaces.basicOperationsWithSet.SetOfGuests.guests;

import java.util.HashSet;
import java.util.Set;

/**
 * Manages a set of guests and provides operations to add, remove, count, and display guests.
 */
public class GuestSet {

    // Set to hold the guests
    Set<Guest> guests = new HashSet<>();

    /**
     * Adds a guest with the specified name and invitation code to the set.
     *
     * @param nameGuest      The name of the guest to add.
     * @param invitationCode The invitation code of the guest to add.
     */
    public void addGuest (String nameGuest, int invitationCode) {
        guests.add(new Guest(invitationCode, nameGuest));
    }

    /**
     * Removes a guest from the set based on the invitation code.
     *
     * @param invitationCode The invitation code of the guest to remove.
     */
    public void removeGuestByInvitationCode (int invitationCode) {
        guests.removeIf(guest -> guest.getInvitedCode() == invitationCode);
    }

    /**
     * Counts and prints the number of guests in the set.
     */
    public void countGuests() {
        String quantityGuests = "Quantity guest: " + guests.size();
        System.out.println(quantityGuests);
    }

    /**
     * Displays all guests in the set.
     */
    public void displayGuests() {
        System.out.println(guests);
    }

}
