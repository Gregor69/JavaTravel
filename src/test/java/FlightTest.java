import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class FlightTest {

    private Flight flight;
    private Plane plane;
    private Passenger passenger1;
    private Passenger passenger2;
    private Passenger passenger3;

    @Before
    public void before() {
        flight = new Flight("BA755", "AIRBUS_380", 5, "GLA", "LDN", "09.00");
        plane = new Plane(PlaneType.AIRBUS_A380);
        passenger1 = new Passenger("Andy", 2);
        passenger2 = new Passenger("Kate", 2);
        passenger3 = new Passenger("Liam", 1);
    }

    @Test
    public void checkFlightHasFlightNo() {
        assertEquals("BA755", flight.getFlightNo());
    }

    @Test
    public void checkFlightHasPlane() {
        assertEquals("AIRBUS_380", flight.getPlane());
    }

    @Test
    public void addPassengersToFlight() {
        flight.addPassengers(passenger1);
        assertEquals(1, flight.getPassengerCount());
    }

    @Test
    public void checkDesAirport(){
        assertEquals("GLA", flight.getDesAirport());
    }

    @Test
    public void checkDepAirport(){
        assertEquals("LDN", flight.getDepAirport());
    }

    @Test
    public void checkDepTime(){
        assertEquals("09.00", flight.getDepTime());
    }

    @Test
    public void checkPlaneHasCapacity() {
        assertEquals(5, flight.getPlaneCapacity());
    }

    @Test
    public void checkRemainingSeats(){
        flight.addPassengers(passenger1);
        flight.addPassengers(passenger2);
        flight.addPassengers(passenger3);
        assertEquals(2, flight.getRemainingSeats());
    }

    @Test
    public void canBookSeat(){
        flight.addPassengers(passenger1);
        flight.addPassengers(passenger1);
        assertEquals(true, flight.bookSeat());

    }









}


