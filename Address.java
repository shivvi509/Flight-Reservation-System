package FlightReservationSystem;

public class Address {
    private String street;
    private String city;
    private String state;
    private int postalCode;
    private String country;

    public Address(String city, String state, int postalCode, String country, String street) {
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.country = country;
        this.street = street;
    }

    public void getStreet() {
        System.out.println("street :" +street);
    }

    public void getCity() {
        System.out.println("City :" +city);
    }

    public void getState() {
        System.out.println("State :" +state );
    }

    public void getPostalCode() {
        System.out.println("Postal Code :" +postalCode);
    }

    public void getCountry(){
        System.out.println("Country :" +country);
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
