package collections.set_interfaces.BasicOperationsWithSet.SetOfGuests.guests;

public class GuestBuilder {

    private String nameGuest;
    private int invitedCode;

    public GuestBuilder invitedCode (int invitedCode) {
        this.invitedCode = invitedCode;
        return this;
    }

    public GuestBuilder nameGuest (String nameGuest) {
        this.nameGuest = nameGuest;
        return this;
    }

    public Guest creationGuest () {
        return new Guest(invitedCode, nameGuest);
    }
}
