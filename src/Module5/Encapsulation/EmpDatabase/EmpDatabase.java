package Module5.Encapsulation.EmpDatabase;

import java.util.Scanner;

class Employee {
    private String name;
    private double salary;
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    double NewSalary;
    public void getNewSalary(double salary) {
        this.salary = NewSalary;
    }
}
public class EmpDatabase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("name=");
        String name = sc.nextLine();
        System.out.println("salary=");
        double salary = sc.nextDouble();
        System.out.println("new salary=");
        double newSalary = sc.nextDouble();

    }
}


