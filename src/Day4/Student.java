package Day4;

public class Student {
    String name;
    int yearOfJoining;
    String address;
    // Method to take input
    public void setInfo(String name, int year, String address) {
        this.name = name;
        this.yearOfJoining = year;
        this.address = address;
    }
    // Method to display student info
    public void display() {
        System.out.printf("%-10s %-15d %s\n", name, yearOfJoining, address);
    }
}
