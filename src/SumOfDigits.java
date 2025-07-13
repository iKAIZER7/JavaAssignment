import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        int sum = 0;
        int originalNumber = number;
        while (number != 0) {
            int digit = number % 10; // Get last digit
            sum += digit;            // Add it to sum
            number = number / 10;    // Remove last digit
        }

        System.out.println("The sum of the digits is " + sum + ".");
        sc.close();

    }
}
