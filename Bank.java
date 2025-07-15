package keystone;

import java.util.Scanner;

public class Bank implements BankDetails {
    private double balance;
    public Bank() {
        this.balance = 0.0;
    }
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    @Override
    public void displayDetails() {
        System.out.println("Account ID: " + ID);
        System.out.println("Password: " + PSWD);
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        BankDetails bank = new Bank();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n1. Deposit\n2. Withdraw\n3. Display Details\n4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double dep = sc.nextDouble();
                    bank.deposit(dep);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double wd = sc.nextDouble();
                    bank.withdraw(wd);
                    break;
                case 3:
                    bank.displayDetails();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);
        sc.close();
    }
}