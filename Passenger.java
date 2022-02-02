package FlightReservationSystem;

public class Passenger {
    private long passengerId;
    private String name;
    private String email;
    private String gender;
    private Contact contact;
    private Address address;
    private static int idCounter ;


    public Passenger(long passengerId, String name, String email, String gender) {
        this.passengerId = passengerId;
        this.name = name;
        this.email = email;
        this.gender = gender;
    }



    public long getPassengerId() {
        return passengerId;
    }


    public void getName() {
        System.out.println("Name :" +name);
    }

    public void getEmail() {
        System.out.println("Email :" +email);
    }

    public void getGender() {
        System.out.println("Gender :" +gender);
    }

    public Contact getContact() {
        return contact;
    }

    public Address getAddress() {
        return address;
    }

    public void setPassengerId(long passengerId) {
        this.passengerId = passengerId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public static void setIdCounter(int idCounter) {
        Passenger.idCounter = idCounter;
    }

    public static int getIdCounter(){
        idCounter++;
        return idCounter;

    }
}
