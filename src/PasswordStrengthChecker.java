import java.util.Scanner;

public class PasswordStrengthChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = sc.nextLine();
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUpper = true;
            } else if (Character.isLowerCase(ch)) {
                hasLower = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else {
                hasSpecial = true;
            }
        }
        int length = password.length();
        if (length >= 8 && hasUpper && hasLower && hasDigit && hasSpecial) {
            System.out.println("Password strength: Strong.");
        } else if (length >= 6 && hasUpper && hasLower && hasDigit) {
            System.out.println("Password strength: Medium.");
        } else {
            System.out.println("Password strength: Weak.");
        }
        sc.close();
    }
}
