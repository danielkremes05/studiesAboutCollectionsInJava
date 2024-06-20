package collections.set_interfaces.BasicOperationsWithSet.SetOfGuests.guests;

import java.util.Objects;

public class Guest {

    /* Create a class called "``GuestSet`` that has a set of objects of type "Guest"
    as an attribute. Each guest has attributes such as name and invitation code.
    Implement the following methods:
     */

    private String nameGuest;
    private int invitedCode;

    public Guest (int invitedCode, String nameGuest) {
        this.invitedCode = invitedCode;
        this.nameGuest = nameGuest;
    }

    public int getInvitedCode () {
        return invitedCode;
    }

    public String getNameGuest () {
        return nameGuest;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Guest guest = (Guest) o;
        return invitedCode == guest.invitedCode && Objects.equals(nameGuest, guest.nameGuest);
    }

    @Override
    public int hashCode () {
        return Objects.hash(nameGuest, invitedCode);
    }

    @Override
    public String toString () {
        return "Guest{" +
                "invitedCode=" + invitedCode +
                ", nameGuest='" + nameGuest + '\'' +
                '}';
    }
}
