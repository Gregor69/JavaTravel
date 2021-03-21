import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    private FlightManager flightManager;
    private Plane plane;
    private Flight flight;
    private Passenger passenger1;
    private Passenger passenger2;
    private Passenger passenger3;

    @Before
    public void before (){
        flightManager = new FlightManager("AIRBUS_380", "Flight", 5, 20);
        passenger1 = new Passenger("Andy", 2);
        passenger2 = new Passenger("Kate", 2);
        passenger3 = new Passenger("Liam", 1);
    }

    @Test
    public void checkBaggageWeight(){
        assertEquals(10, flightManager.getBaggageWeight());
    }

    @Test
    public void checkBagWeightPerPassenger(){
        assertEquals(2, flightManager.getBagWeightPerPassenger());
    }

//    @Test
//    public void getTotalBagsWeight(){
//        flight.addPassengers(passenger1);
//        flight.addPassengers(passenger2);
//        flight.addPassengers(passenger3);
//        assertEquals(10, flightManager.getBagsWeight());
//    }



}
