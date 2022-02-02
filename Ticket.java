package FlightReservationSystem;

public abstract class Ticket {
    private Passenger passenger;
    private Flight flight;
     String dateOfArrival;
     String timeOfArrival;
     String dateOfDeparture;
     String timeOfDeparture;
     String durationOfJourney;
     int ticketPrice;
     int seatNumber;
     String PNR_Number;


    public Ticket( String dateOfArrival, String timeOfArrival, String dateOfDeparture, String timeOfDeparture, String durationOfJourney, int ticketPrice, int seatNumber,String PNR_Number) {

        this.dateOfArrival = dateOfArrival;
        this.timeOfArrival = timeOfArrival;
        this.dateOfDeparture = dateOfDeparture;
        this.timeOfDeparture = timeOfDeparture;
        this.durationOfJourney = durationOfJourney;
        this.ticketPrice = ticketPrice;
        this.seatNumber = seatNumber;
        this.PNR_Number = PNR_Number;
    }
    public abstract void printPNR();
    public abstract void printSeatNumber();
    public abstract void printTicketPrice();
    public abstract void printDateOfArrival();
    public abstract void printTimeOfArrival();
    public abstract void printTimeOfDeparture();
    public abstract void printDateOfDeparture();
    public abstract void printDurationOfJourney();


}
