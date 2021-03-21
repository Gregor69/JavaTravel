import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class FlightTest {

    private Flight flight;
    private Plane plane;
    private Passenger passenger1;

    @Before
    public void before() {
        flight = new Flight("BA755", "AIRBUS_380", 50, "GLA", "LDN", "09.00");
        plane = new Plane(PlaneType.AIRBUS_A380);
        passenger1 = new Passenger("Andy", 2);
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
        assertEquals(50, flight.getPlaneCapacity());
    }










}


