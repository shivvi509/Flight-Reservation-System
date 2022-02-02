package FlightReservationSystem;

public class Flight {
    private long flightNumber;
    private String airlineOfFlight;
    private int capacityOfFlight;
    private int numberOfSeats;
    private boolean availabilityOfSeats;

    public Flight(long flightNumber, String airlineOfFlight, int capacityOfFlight, int numberOfSeats, boolean availabilityOfSeats) {
        this.flightNumber = flightNumber;
        this.airlineOfFlight = airlineOfFlight;
        this.capacityOfFlight = capacityOfFlight;
        this.numberOfSeats = numberOfSeats;
        this.availabilityOfSeats = availabilityOfSeats;
    }

    public void getFlightNumber() {
        System.out.println("Flight Number :" +flightNumber);
    }

    public void getAirlineOfFlight() {
        System.out.println("Airline of Flight :" +airlineOfFlight);
    }

    public void getCapacityOfFlight() {
        System.out.println("Capacity is :" + capacityOfFlight);
    }

    public void getNumberOfSeats() {
        System.out.println("Number of Seat " +numberOfSeats);
    }

    public void isAvailabilityOfSeats() {
        System.out.println("Availability :" + availabilityOfSeats);
    }

    public void setFlightNumber(long flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setAirlineOfFlight(String airlineOfFlight) {
        this.airlineOfFlight = airlineOfFlight;
    }

    public void setCapacityOfFlight(int capacityOfFlight) {
        this.capacityOfFlight = capacityOfFlight;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public void setAvailabilityOfSeats(boolean availabilityOfSeats) {
        this.availabilityOfSeats = availabilityOfSeats;
    }
}
