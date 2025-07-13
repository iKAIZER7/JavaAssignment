import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        final int CURRENT_YEAR = 2025;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your birth year: ");
        int birthYear = sc.nextInt();

        int age = CURRENT_YEAR - birthYear;

        System.out.println("You are " + age + " years old.");

        sc.close();
    }
}
