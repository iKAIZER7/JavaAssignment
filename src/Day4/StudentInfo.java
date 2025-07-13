package Day4;
import java.util.Scanner;
public class StudentInfo {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[3];

        for (int i = 0; i < 3; i++) {
            students[i] = new Student();
            System.out.println("Enter details for Student " + (i + 1));

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Year of Joining: ");
            int year = scanner.nextInt();
            scanner.nextLine(); // consume newline

            System.out.print("Address: ");
            String address = scanner.nextLine();

            students[i].setInfo(name, year, address);
            System.out.println();
        }

        // Displaying student information
        System.out.println("Name       Year of joining   Address");
        for (Student s : students) {
            s.display();

            scanner.close();
        }
    }
}