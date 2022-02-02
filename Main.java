package FlightReservationSystem;

import java.util.Scanner;
import java.util.Random;


public class Main {



    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        // long regular,tourist;

        System.out.println("________WELCOME TO FLIGHT RESERVATION SYSTEM_________");
        System.out.println("Which Reservation Ticket You Want to Book :");
        System.out.println("Press 1 to book Regular Ticket");
        System.out.println("Press 2 to book Tourist Ticket");
        int choice = sc.nextInt();


        switch (choice) {
            case 1:
                RegularTicket ticket;
            {
                System.out.println("Enter your basic Details for booking ticket");
                Scanner s = new Scanner(System.in);
                System.out.println("Enter Your Name :");
                String name = s.nextLine();
                System.out.println("Enter Your email Id :");
                String email = s.nextLine();
                System.out.println("Enter Your Gender :");
                String gender = s.nextLine();
                Passenger passenger = new Passenger(4257, name, email, gender);
                System.out.println("Give your Address Details :");
                System.out.println("Enter street :");
                String street = s.nextLine();
                System.out.println("Enter City :");
                String city = s.nextLine();
                System.out.println("Your State :");
                String state = s.nextLine();
                System.out.println("Enter Your country :");
                String country = s.next();
                System.out.println("Enter your postal code :");
                int postalCode = s.nextInt();

                Address address = new Address( city, state, postalCode, country,street);

                System.out.println("Enter Mobile Number :");
                long mobileNumber = s.nextLong();
                System.out.println("Enter Telephone Number :");
                int telephoneNumber = s.nextInt();


                Contact contact = new Contact(mobileNumber, telephoneNumber);


                String xyz = createPNR();
                RegularTicket ticket1 = new RegularTicket("Vegetable Sandwich",true,"Spring Roll","05/02/2022","5:00 PM","05/02/2022","4:00 PM","1:00 Hour",5000,52,xyz);
                printTicketDetails(ticket1);
                printPassengerDetails(passenger);
                printAddressDetails(address);
                printContactDetails(contact);


                break;


            }

            case 2: {
                System.out.println("Enter your basic Details for booking ticket");
                Scanner s = new Scanner(System.in);
                System.out.println("Enter Your Name :");
                String name = s.nextLine();
                System.out.println("Enter Your email Id :");
                String email = s.nextLine();
                System.out.println("Enter Your Gender :");
                String gender = s.nextLine();
                Passenger passenger = new Passenger(4257, name, email, gender);
                System.out.println("Give your Address Details :");
                System.out.println("Enter street :");
                String street = s.nextLine();
                System.out.println("Enter City :");
                String city = s.nextLine();
                System.out.println("Your State :");
                String state = s.nextLine();
                System.out.println("Enter Your country :");
                String country = s.nextLine();
                System.out.println("Enter your postal code :");
                int postalCode = s.nextInt();

                Address address = new Address(city,state,postalCode,country,street);

                System.out.println("Enter Mobile Number :");
                long mobileNumber = s.nextLong();
                System.out.println("Enter Telephone Number :");
                int telephoneNumber = s.nextInt();

                Contact contact = new Contact(mobileNumber, telephoneNumber);


                String xyz = createPNR();
                TouristTicket touristticket = new TouristTicket("05/03/2022","3:30 PM","05/03/2022","4:30 PM","1:00 Hour",6000,65,"Chandivali","Mumbai",xyz);

                printTicketDetails(touristticket);
                printPassengerDetails(passenger);
                printAddressDetails(address);
                printContactDetails(contact);


                break;

            }
            default: {
                System.out.println("Invalid choice_____");
                break;
            }
        }}
            public static void printTicketDetails (RegularTicket ticket){
                ticket.printPNR();
                ticket.printSeatNumber();
                ticket.printTicketPrice();
                ticket.printDateOfArrival();
                ticket.printTimeOfArrival();
                ticket.printDurationOfJourney();
                ticket.printDateOfDeparture();
                ticket.printTimeOfDeparture();
            }

            public static void printTicketDetails (TouristTicket ticket){
                ticket.printPNR();
                ticket.printSeatNumber();
                ticket.printTicketPrice();
                ticket.printDateOfArrival();
                ticket.printTimeOfArrival();
                ticket.printDurationOfJourney();
                ticket.printDateOfDeparture();
                ticket.printTimeOfDeparture();
            }

                public static void printPassengerDetails (Passenger passenger){
                    System.out.println("Passenger Basic Details:");
                    passenger.getName();
                    passenger.getEmail();
                    passenger.getGender();
                }
                public static void printAddressDetails (Address address){
                    System.out.println("Passenger Address Details");
                    address.getCountry();
                    address.getState();
                    address.getPostalCode();
                    address.getCity();
                    address.getStreet();
                }
                public static void printContactDetails (Contact contact){
                    System.out.println("Passenger Contact Details");
                    contact.getMobileNumber();
                    contact.getTelephoneNumber();
                }
                public static void printFlightDetails (Flight flight){
                    System.out.println("Flight Details ");
                    flight.getAirlineOfFlight();
                    flight.getNumberOfSeats();
                    flight.getFlightNumber();
                    flight.getCapacityOfFlight();
                    flight.isAvailabilityOfSeats();
                }

                public static String createPNR () {
                    String pnr = "";
                    Random rand = new Random();
                    for (int index = 0; index < 6; index++) {
                        int randomNumber = rand.nextInt(9);
                        String number = String.valueOf(randomNumber);
                        pnr = pnr + number;
                    }
                    return pnr;
                }
            }
