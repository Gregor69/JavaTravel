import java.util.ArrayList;


public class Flight {

    private String flightNo;
    private String plane;
    private int capacity;
    private ArrayList<Passenger> passengers;
    private String desAirport;
    private String depAirport;
    private String depTime;


    public Flight(String flightNo, String plane, int capacity, String desAirport, String depAirport, String depTime) {
        this.flightNo = flightNo;
        this.plane = plane;
        this.capacity = capacity;
        this.passengers = new ArrayList<Passenger>();
        this.desAirport = desAirport;
        this.depAirport = depAirport;
        this.depTime = depTime;
    }


    public String getFlightNo() {
        return this.flightNo;
    }

    public String getPlane() {
        return this.plane;
    }

    public void addPassengers(Passenger passenger1) {
        this.passengers.add(passenger1);
    }

    public int getPassengerCount() {
        return this.passengers.size();
    }

    public String getDesAirport() {
        return this.desAirport;
    }

    public String getDepAirport() {
        return this.depAirport;
    }

    public String getDepTime() {
        return this.depTime;
    }

    public int getPlaneCapacity() {
        return this.capacity;
    }

    public int getRemainingSeats() {
        return(getPlaneCapacity() - passengers.size());
    }

    public boolean bookSeat() {
        if(this.getPlaneCapacity() > this.passengers.size()){
            return true;
        } else return false;
    }
}


