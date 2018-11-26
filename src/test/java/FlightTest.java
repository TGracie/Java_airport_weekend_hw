import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight1;
    Plane plane1;
    Passenger passenger1;

    @Before
    public void before(){
        flight1 = new Flight(3130, "Newcastle", 60);
        plane1 = new Plane(Type.CESSNA, "Bushwhack");
        passenger1 = new Passenger();
    }

    @Test
    public void flightNeedsPlane(){
        assertEquals(null, flight1.getPlane());
    }

    @Test
    public void assignAPlane(){
        flight1.addPlane(plane1);
        assertEquals(plane1, flight1.getPlane());
    }

    @Test
    public void addPassenger(){
        flight1.addPlane(plane1);
        flight1.addPassenger(passenger1);
        assertEquals(1, flight1.passengerCount());
    }



}// doc end
