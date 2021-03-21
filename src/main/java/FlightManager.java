import java.util.ArrayList;

public class FlightManager {

    private String flightManager;
    private String plane;
    private String flight;
    private int capacity;
    private int weight;
    private ArrayList<Passenger> passengers;

    public FlightManager(String plane, String flight, int capacity, int weight) {
        this.plane = plane;
        this.flight = flight;
        this.capacity = capacity;
        this.weight = weight;
        this.passengers = new ArrayList<Passenger>();



    }

    public int getBaggageWeight() {
        return this.weight / 2;
    }

    public int getBagWeightPerPassenger() {
        return getBaggageWeight() / this.capacity;
    }


//    public int getBagsWeight() {
//        return this.passengers * this.passengers.bags;
//
//    }
}
