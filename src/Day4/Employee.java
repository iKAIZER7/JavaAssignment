package Day4;

public class Employee {

    int salary;
    int hoursPerDay;
    // Method to take salary and working hours as input
    public void getInfo(int salary, int hours) {
        this.salary = salary;
        this.hoursPerDay = hours;
    }
    // Method to add $10 to salary if less than $500
    public void addSal() {
        if (salary < 500) {
            salary += 10;
        }
    }
    // Method to add $5 to salary if working more than 6 hours per day
    public void addWork() {
        if (hoursPerDay > 6) {
            salary += 5;
        }
    }
    // Method to print final salary
    public void printSalary() {
        System.out.println("Final salary: $" + salary);
    }

}
