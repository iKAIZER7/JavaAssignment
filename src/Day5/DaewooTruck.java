package Day5;

public class DaewooTruck implements Truck {
    private final int axles;
    private final int totalWeight;
    private final String make;

    public DaewooTruck(int axles, int totalWeight) {
        this.axles = axles;
        this.totalWeight = totalWeight;
        this.make = "Daewoo";
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
