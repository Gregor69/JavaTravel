public class Passenger {

    private String name;
    private int bags;


    public Passenger (String name,  int bags) {
        this.name = name;
        this.bags = bags;

    }

    public String hasName() {
        return this.name;
    }

    public int hasBags() {
        return this.bags;
    }
}
