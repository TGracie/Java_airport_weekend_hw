import java.util.ArrayList;

public class Plane {
    private Type type;
    private String airline;
    private ArrayList<Passenger> passengers;

    public Plane(Type type, String airline){
        this.type = type;
        this.airline = airline;
        this.passengers = new ArrayList<>();
    }

    public int getCapacity(){
        return this.type.planeCapacity();
    }

    public int passengerCount() {
        return this.passengers.size();
    }

    public boolean isFull(){
        return this.passengerCount() == this.getCapacity();
    }

    public void addPassenger(Passenger passenger) {
        if(!isFull()){
            this.passengers.add(passenger);
            System.out.println("Passenger Added!");
        }else{
            System.out.println("Plane Full!");
        }
    }
}
