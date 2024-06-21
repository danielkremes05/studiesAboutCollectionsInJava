package collections.set_interfaces.basicOperationsWithSet.SetOfGuests.guests;

/**
 * A builder class for creating Guest objects.
 */
public class GuestBuilder {

    private String nameGuest;
    private int invitedCode;

    /**
     * Sets the invitation code for the guest being built.
     * @param invitedCode The invitation code to set.
     * @return The GuestBuilder instance for method chaining.
     */
    public GuestBuilder invitedCode(int invitedCode) {
        this.invitedCode = invitedCode;
        return this;
    }

    /**
     * Sets the name of the guest being built.
     * @param nameGuest The name to set.
     * @return The GuestBuilder instance for method chaining.
     */
    public GuestBuilder nameGuest(String nameGuest) {
        this.nameGuest = nameGuest;
        return this;
    }

    /**
     * Constructs a Guest object using the provided attributes.
     * @return A new Guest object with the set attributes.
     */
    public Guest creationGuest() {
        return new Guest(invitedCode, nameGuest);
    }
}
