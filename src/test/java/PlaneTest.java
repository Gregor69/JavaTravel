import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before() {
        plane = new Plane(PlaneType.AIRBUS_A380);

    }

    @Test
    public void planeHasType (){
        assertEquals(PlaneType.AIRBUS_A380, plane.getPlaneType());
    }

    @Test
    public void planeHasCapacity(){
        assertEquals(500, plane.getCapacity());
    }

    @Test
    public void planeHasWeight(){
        assertEquals(250, plane.getWeight());
    }
}
