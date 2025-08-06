package Module5.Encapsulation.BankAccountManagement;

import java.util.Scanner;

class BankAccount {
    private String Name;
    private double Balance;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
    public double getBalance() {
        return Balance;
    }
    public void setBalance(double balance) {
        Balance = balance;
    }
    public void deposit(double amount) {
        Balance += amount;
    }
    public void withdraw(double amount) {
        Balance -= amount;
    }
}
public class BankAccountManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount b = new BankAccount();
        System.out.println("Enter your name:");
        b.setName(sc.next());
        System.out.println("Enter your Balance:");
        b.setBalance(sc.nextDouble());
        System.out.println("Enter Your Account:");

    }
}
