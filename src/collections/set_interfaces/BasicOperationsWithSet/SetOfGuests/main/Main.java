package collections.set_interfaces.BasicOperationsWithSet.SetOfGuests.main;

import collections.set_interfaces.BasicOperationsWithSet.SetOfGuests.guests.Guest;
import collections.set_interfaces.BasicOperationsWithSet.SetOfGuests.guests.GuestBuilder;
import collections.set_interfaces.BasicOperationsWithSet.SetOfGuests.guests.GuestSet;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String[] args) {

        List<GuestSet> guestStore = new ArrayList<>();

        Guest guest = new GuestBuilder()
                .nameGuest("Daniel")
                .invitedCode(400)
                .creationGuest();

        GuestSet guestSet = new GuestSet();

        guestSet.addGuest(guest.getNameGuest(), guest.getInvitedCode());

        guestStore.add(guestSet);

        // System.out.println(guestStore);

        guestSet.displayGuests();

        // System.out.println(guestSet);
        // guestSet.countGuests();

        // guestSet.removeGuestByInvitationCode(400);

        // System.out.println(guestSet);
        // guestSet.countGuests();

    }
}
