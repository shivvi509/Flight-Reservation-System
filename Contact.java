package FlightReservationSystem;

public class Contact {

    private long mobileNumber;
    private int telephoneNumber;
    private Address address;


    public Contact(long mobileNumber, int telephoneNumber) {
        this.mobileNumber = mobileNumber;
        this.telephoneNumber = telephoneNumber;
    }

    public void getMobileNumber() {
        System.out.println("MObile Number :" +mobileNumber);
    }

    public void getTelephoneNumber() {
        System.out.println("Telephone number :" +telephoneNumber);
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setTelephoneNumber(int telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}


