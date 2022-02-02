package FlightReservationSystem;

public class TouristTicket extends Ticket {
    private String hotelAddress;
    private String location;

    public TouristTicket(String dateOfArrival, String timeOfArrival, String dateOfDeparture, String timeOfDeparture, String durationOfJourney, int ticketPrice, int seatNumber, String hotelAddress, String location, String PNR_Number) {
        super(dateOfArrival, timeOfArrival, dateOfDeparture, timeOfDeparture, durationOfJourney, ticketPrice, seatNumber, PNR_Number);
        this.hotelAddress = hotelAddress;
        this.location = location;
    }

    @Override
    public void printPNR() {
        System.out.println("Passenger Details are :");
        System.out.println("PNR Number of ticket is :" +PNR_Number);
    }

    @Override
    public void printSeatNumber() {
        System.out.println("Seat Number :" +seatNumber);
    }

    @Override
    public void printTicketPrice() {
        System.out.println("Ticket Price :" +ticketPrice);
    }

    @Override
    public void printDateOfArrival() {
        System.out.println("Date of Flight Arrival :" +dateOfArrival);
    }

    @Override
    public void printTimeOfArrival() {
        System.out.println(" Time of Arrival of Flight :" +timeOfArrival);
    }

    @Override
    public void printTimeOfDeparture() {
        System.out.println(" Time of departure of Flight :" +timeOfDeparture);
    }

    @Override
    public void printDateOfDeparture() {
        System.out.println(" Date of Departure of Flight :" +dateOfDeparture);
    }

    @Override
    public void printDurationOfJourney() {
        System.out.println("Duration Of Journey :" +durationOfJourney);
    }

    public void getHotelAddress() {
        System.out.println("Hotel Address --- " +hotelAddress);
    }

    public void getLocation() {
        System.out.println("Location ---" +location);
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}



