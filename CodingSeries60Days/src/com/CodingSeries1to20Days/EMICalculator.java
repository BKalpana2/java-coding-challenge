package com.CodingSeries1to20Days;

import java.util.Scanner;

public class EMICalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter loan amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter annual interest rate (%): ");
        double annualRate = sc.nextDouble();

        System.out.print("Enter loan tenure (in years): ");
        int years = sc.nextInt();

        double monthlyRate = annualRate / (12 * 100);
        int months = years * 12;

        double emi = (principal * monthlyRate * Math.pow(1 + monthlyRate, 		months))/ (Math.pow(1 + monthlyRate, months) - 1);

        double totalPayment = emi * months;
        double totalInterest = totalPayment - principal;
        System.out.println();

        System.out.printf("Monthly EMI: %.2f%n", emi);
        System.out.printf("Total Interest: %.2f%n", totalInterest);
        System.out.printf("Total Payment: %.2f%n", totalPayment);

        sc.close();
    }
}
