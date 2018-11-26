import java.util.ArrayList;

public class Airport {

    private ArrayList<Plane> hangar;
    private ArrayList<Flight> flights;
    private String code;
    private int till;

    public Airport(String code){
        this.hangar = new ArrayList<>();
        this.flights = new ArrayList<>();
        this.code = code;
        this.till = 0;
    }

    public int planeCount(){
        return this.hangar.size();
    }

    public int takings(){
        return this.till;
    }

    public void storePlane(Plane plane){
        this.hangar.add(plane);
    }

    public int flightCount(){
        return this.flights.size();
    }

    public void newFlight(Plane plane, int number, String destination, int price) {
        Flight newFlight = new Flight(number, destination, price);
        newFlight.addPlane(plane);
        this.flights.add(newFlight);
    }

    public void sellTicket(Flight flight, Passenger pas){
        int price = flight.getPrice();
        if(flight.passengerCount() < flight.getCapacity()){
            this.transaction(price);
            flight.addPassenger(pas);
        }else{
            System.out.println("Plane Full");
        }
    }

    public void transaction(int price){
        this.till += price;
    }

    public void addFlight(Flight flight) {
        this.flights.add(flight);
    }
}// class end
