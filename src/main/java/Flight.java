public class Flight {

    private Plane plane;
    private int number;
    private String destination;
    private int price;

    public Flight(int number, String destination, int price){
        this.plane = plane;
        this.number = number;
        this.destination = destination;
        this.price = price;
    }

    public void addPlane(Plane plane){
        this.plane = plane;
    }

    public Plane getPlane(){
        return this.plane;
    }

    public int getCapacity(){
        return this.plane.getCapacity();
    }

    public int getNumber(){
        return this.number;
    }

    public String getDestination(){
        return this.destination;
    }

    public int getPrice(){
        return this.price;
    }

    public void addPassenger(Passenger p){
        this.plane.addPassenger(p);
    }

    public int passengerCount(){
        return this.plane.passengerCount();
    }

}
