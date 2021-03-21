public enum PlaneType {

    AIRBUS_A380(500, 250),
    BOEING_747(400, 200);

    private final int capacity;

    private final int weight;

    PlaneType(int capacity, int weight) {
        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacity(){
        return capacity;
    }

    public int getWeight(){
        return weight;
    }


}
