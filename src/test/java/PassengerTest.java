import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Passenger passenger;

    @Before
    public void before () {
        passenger = new Passenger("Andy", 2);
    }

    @Test
    public void checkPassengerHasName(){
        assertEquals("Andy", passenger.hasName());
    }

    @Test
    public void checkPassengerHasBags(){
        assertEquals(2, passenger.hasBags());
    }
}
