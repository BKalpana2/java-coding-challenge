package com.codingseries41to60Days;
import java.util.Scanner;
public class BankBalanceChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== Bank Balance Checker =====");
        System.out.print("Enter account holder name: ");
        String name = sc.nextLine();
        System.out.print("Enter account number: ");
        String accountNumber = sc.nextLine();
        System.out.print("Enter current balance: ₹");
        double balance = sc.nextDouble();
        System.out.println("\n----- BANK ACCOUNT DETAILS -----");
        System.out.println("Account Holder : " + name);
        System.out.println("Account Number : " + accountNumber);
        System.out.printf("Balance        : ₹%.2f%n", balance);
        if (balance < 0) {
            System.out.println("Account Status : Overdrawn");
            System.out.println("Message        : Your account balance is negative.");
        } else if (balance == 0) {
            System.out.println("Account Status : Zero Balance");
            System.out.println("Message        : Your account currently has no available balance.");
        } else if (balance < 5000) {
            System.out.println("Account Status : Low Balance");
            System.out.println("Message        : Your account balance is low.");
        } else {
            System.out.println("Account Status : Sufficient Balance");
            System.out.println("Message        : Your account has sufficient balance.");
        }
        System.out.println("\n--------------------------------------");
        System.out.println("Bank balance checking completed.");
        System.out.println("--------------------------------------");
        sc.close();
    }
}
