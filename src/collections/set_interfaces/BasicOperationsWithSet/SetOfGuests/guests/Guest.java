package collections.set_interfaces.BasicOperationsWithSet.SetOfGuests.guests;

import java.util.Objects;

/**
 * Represents a guest with attributes such as name and invitation code.
 */
public class Guest {

    private String nameGuest;
    private int invitedCode;

    /**
     * Constructs a Guest object with the specified invitation code and name.
     * @param invitedCode The invitation code of the guest.
     * @param nameGuest The name of the guest.
     */
    public Guest(int invitedCode, String nameGuest) {
        this.invitedCode = invitedCode;
        this.nameGuest = nameGuest;
    }

    /**
     * Retrieves the invitation code of the guest.
     * @return The invitation code of the guest.
     */
    public int getInvitedCode() {
        return invitedCode;
    }

    /**
     * Retrieves the name of the guest.
     * @return The name of the guest.
     */
    public String getNameGuest() {
        return nameGuest;
    }

    /**
     * Checks if this guest is equal to another object.
     * Two guests are considered equal if they have the same invitation code and name.
     * @param o The object to compare.
     * @return True if the objects are equal, false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Guest guest = (Guest) o;
        return invitedCode == guest.invitedCode && Objects.equals(nameGuest, guest.nameGuest);
    }

    /**
     * Computes the hash code for this guest.
     * @return The hash code for this guest.
     */
    @Override
    public int hashCode() {
        return Objects.hash(nameGuest, invitedCode);
    }

    /**
     * Generates a string representation of the guest object.
     * @return A string representation of the guest.
     */
    @Override
    public String toString() {
        return "Guest{" +
                "invitedCode=" + invitedCode +
                ", nameGuest='" + nameGuest + '\'' +
                '}';
    }
}
