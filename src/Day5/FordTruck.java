package Day5;

public class FordTruck implements Truck {
    private final int axles;
    private final int totalWeight;
    private final String make;

    public FordTruck(int axles, int totalWeight) {
        this.axles = axles;
        this.totalWeight = totalWeight;
        this.make = "Ford";
    }

    public int getAxles() {
        return axles;
    }

    public int getTotalWeight() {
        return totalWeight;
    }

    public String getMake() {
        return make;
    }
}
