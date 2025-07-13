package Day4;

import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();

        System.out.print("Enter employee salary: ");
        int salary = sc.nextInt();

        System.out.print("Enter working hours per day: ");
        int hours = sc.nextInt();

        emp.getInfo(salary, hours);
        emp.addSal();
        emp.addWork();
        emp.printSalary();

        sc.close();
    }
}
