package com.CodingSeries21to40Days;
import java.util.Scanner;
public class LoanEMIEligibilityChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== Loan EMI Eligibility Checker =====");
        System.out.print("Enter monthly salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter existing monthly EMI: ");
        double existingEMI = sc.nextDouble();
        System.out.print("Enter loan amount: ");
        double loanAmount = sc.nextDouble();
        System.out.print("Enter loan tenure (in months): ");
        int tenure = sc.nextInt();
        System.out.print("Enter annual interest rate (%): ");
        double annualRate = sc.nextDouble();
        double monthlyRate = annualRate / (12 * 100);
        double emi;
        if (monthlyRate == 0) {
            emi = loanAmount / tenure;
        } else {
            emi = (loanAmount * monthlyRate * Math.pow(1 + monthlyRate, tenure))
                    / (Math.pow(1 + monthlyRate, tenure) - 1);
        }
        double totalEMI = existingEMI + emi;
        double maximumEMI = salary * 0.50;
        System.out.println("\n===== Loan Details =====");
        System.out.printf("Monthly Salary: ₹%.2f%n", salary);
        System.out.printf("Loan EMI: ₹%.2f%n", emi);
        System.out.printf("Total Monthly EMI: ₹%.2f%n", totalEMI);
        System.out.printf("Maximum Allowed EMI: ₹%.2f%n", maximumEMI);
        if (totalEMI <= maximumEMI) {
            System.out.println("Status: Eligible for Loan");
        } else {
            System.out.println("Status: Not Eligible for Loan");
        }
        sc.close();
    }
}
