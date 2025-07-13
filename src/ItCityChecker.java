import java.util.Scanner;

public class ItCityChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a city name: ");
        String city = sc.nextLine();
        city = city.toLowerCase();
        if (city.equals("delhi") || city.equals("mumbai") || city.equals("kolkata") ||
                city.equals("bangalore") || city.equals("chennai") || city.equals("hyderabad")) {
            System.out.println("It is an IT City.");
        } else {
            System.out.println("It is not an IT City.");
        }

        sc.close();
    }
}
