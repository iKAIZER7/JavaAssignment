package Day5;

public class TestTollBooth {
    public static void main(String[] args) {
        TollBooth booth = new AlleghenyTollBooth();

        Truck ford = new FordTruck(5, 12500);     // Toll: 275
        Truck nissan = new NissanTruck(2, 5000);  // Toll: 110
        Truck daewoo = new DaewooTruck(6, 17000); // Toll: 370

        booth.calculateToll(ford);
        booth.calculateToll(nissan);
        booth.calculateToll(daewoo);

        booth.reset();
    }
}
