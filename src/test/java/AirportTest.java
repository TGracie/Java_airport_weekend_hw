import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AirportTest {

    Airport edi;
    Airport gla;
    Plane plane1;
    Plane plane2;
    Plane plane3;
    Flight flight1;
    Passenger passenger;

    @Before
    public void before(){
        edi = new Airport("EDI");
        gla = new Airport("GLA");
        plane1 = new Plane(Type.CESSNA, "Bushwhack");
        plane2 = new Plane(Type.ANTONOV, "Outback");
        plane3 = new Plane(Type.PIPER, "PootFloot");
        edi.storePlane(plane1);
        edi.storePlane(plane2);
        edi.storePlane(plane3);
        flight1 = new Flight(4140, "Inverness", 50);
        flight1.addPlane(plane2);
        edi.addFlight(flight1);
        passenger = new Passenger();

    }

    @Test
    public void airportNeedsPlanes(){
        assertEquals(0, gla.planeCount());
    }

    @Test
    public void airportHasPlanes(){
        assertEquals(3, edi.planeCount());
    }

    @Test
    public void noFlights(){
        assertEquals(0, gla.flightCount());
    }

    @Test
    public void newFlight(){
        edi.newFlight(plane1,2120, "Aberdeen",70);
        assertEquals(2, edi.flightCount());
    }

    @Test
    public void sellTicket(){
        edi.sellTicket(flight1, passenger);
        assertEquals(50, edi.takings());
    }

    @Test
    public void planeFull(){
        edi.sellTicket(flight1, passenger);
        edi.sellTicket(flight1, passenger);
        assertEquals(1, flight1.passengerCount());
    }


}// doc end
