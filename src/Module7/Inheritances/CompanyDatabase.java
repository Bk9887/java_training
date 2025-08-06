package Module7.Inheritances;

import java.util.Scanner;

class Employee {
    int EmpID;
    float salary;
    Employee(int empID, float salary) {
        this.EmpID = empID;
        this.salary = salary;
    }
}
class EmpLevel extends Employee {
    int level;
    EmpLevel(int empID, float salary) {
        super(empID, salary);
        this.level = 1;
        if (salary >= 1000) {
            level++;
        }
    }
}
public class CompanyDatabase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee ID: ");
        int empID = sc.nextInt();
        System.out.println("Enter Salary: ");
        float salary = sc.nextFloat();
        EmpLevel emp = new EmpLevel(empID, salary);
        System.out.println("Employee ID=" + emp.EmpID);
        System.out.println("Salary=" + emp.salary);
        System.out.println("Level=" + emp.level);
    }
}
