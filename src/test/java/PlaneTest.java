import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;
    Passenger passenger1;


    @Before
    public void before(){
        // cessna is 8 seater
        plane = new Plane(Type.CESSNA, "Bushwhack");
        passenger1 = new Passenger();
    }

    @Test
    public void planeStartsEmpty(){
        assertEquals(0, plane.passengerCount());
    }

    @Test
    public void planeHasCapacity(){
        assertEquals(8, plane.getCapacity());
    }

    @Test
    public void canAddPassengerToPlane(){
        plane.addPassenger(passenger1);
        assertEquals(1, plane.passengerCount());
    }

    @Test
    public void planeFull(){
        plane.addPassenger(passenger1); //1
        plane.addPassenger(passenger1); //2
        plane.addPassenger(passenger1); //3
        plane.addPassenger(passenger1); //4
        plane.addPassenger(passenger1); //5
        plane.addPassenger(passenger1); //6
        plane.addPassenger(passenger1); //7
        plane.addPassenger(passenger1); //8
        plane.addPassenger(passenger1); //9
        assertEquals(8, plane.passengerCount());
    }


}
