package Day5;

public class AlleghenyTollBooth implements TollBooth{
    private int totalTrucks;
    private int totalReceipts;

    public AlleghenyTollBooth() {
        totalTrucks = 0;
        totalReceipts = 0;
    }

    public void calculateToll(Truck truck) {
        int axles = truck.getAxles();
        int weight = truck.getTotalWeight();

        int tollDue = (axles * 5) + ((weight / 500) * 10);

        System.out.println("Arrival of " + truck.getMake() + " Truck");
        System.out.println("Truck arrival - Axles: " + axles +
                " Total weight: " + weight +
                " Toll due: $" + tollDue);

        totalTrucks++;
        totalReceipts += tollDue;
    }

    public void displayData() {
        System.out.println("Totals since last collection - Receipts: $" + totalReceipts + " Trucks: " + totalTrucks);
    }

    public void reset() {
        System.out.println("*** Collecting receipts ***");
        displayData();
        System.out.println("***** Reset Receipts **********");
        totalTrucks = 0;
        totalReceipts = 0;
        displayData();
    }
}
