package collections.set_interfaces.BasicOperationsWithSet.SetOfGuests.guests;

import java.util.HashSet;
import java.util.Set;

public class GuestSet {
    Set<Guest> guests = new HashSet<>();

    public void addGuest (String nameGuest, int invitationCode) {
        guests.add(new Guest(invitationCode, nameGuest));
    }

    public void removeGuestByInvitationCode (int invitationCode) {
        guests.removeIf(
                guest -> guest.getInvitedCode() == invitationCode
        );
    }

    public void countGuests () {
        String quantityGuests = "Quantity guest: " + guests.size();
        System.out.println(quantityGuests);
    }

    public void displayGuests () {
        System.out.println(guests);
    }

}
