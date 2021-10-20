package FlightReservationSystem;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Flight flight = new Flight(1234,"INDIGO",60,56);

        Passenger passenger = new Passenger("Rajat Kumar Bhoi","+91 9937646709","rajatkumarbhoi0@gmail.com",
                                            "Chandaka","Bhubaneswer","Odisha");

        // creating regularTicket and touristTicket objects (as mentioned in Project Checkpoints).
        RegularTicket regularTicket = new RegularTicket("1727","Bhubaneswer","Kolkata",flight,
                "01/01/2021 - 01:20 am IST","01/01/2021 - 01:50 am IST",passenger,35
        ,30000, true, "Food", "7H");

        TouristTicket touristTicket = new TouristTicket("1728","Bhubaneswer","Mumbai", flight,
                "15/01/2021 - 08:30 am IST","15/01/2021 - 10:00 am IST", passenger, 011,
                50000, true, "Taj Hotel",new String[]{"a","b","c","d"}, "1H 30M");

        //printing ticket details (as mentioned in Project Checkpoints).
        printTicketDetails(regularTicket);
        printTicketDetails(touristTicket);

        //testing methods:
        System.out.println(passenger.getAddressDetails());
        System.out.println(passenger.getContactDetails());
        System.out.println(passenger.getPassengerCount());

        System.out.println(flight.getFlightDetails());
        flight.checkAvailability();

        regularTicket.ticketStatus();
        System.out.println(regularTicket.getSplServicesAvailed());
        System.out.println(regularTicket.getJourneyDuration());

        System.out.println(Arrays.toString(touristTicket.getSelectedLocations()));
        System.out.println(touristTicket.getHotelAddress());

    }

    public static void printTicketDetails(Ticket ticket){
        System.out.println(ticket.getPnr());
    }
}
