package com.CodingSeries21to40Days;
import java.util.Scanner;
public class InsurancePremiumCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== Insurance Premium Calculator =====");
        System.out.print("Enter policy holder name: ");
        String name = sc.nextLine();
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.print("Enter coverage amount: ₹");
        double coverageAmount = sc.nextDouble();
        double premiumRate;
        if (age >= 18 && age <= 30) {
            premiumRate = 0.02;
        } else if (age <= 45) {
            premiumRate = 0.03;
        } else if (age <= 60) {
            premiumRate = 0.04;
        } else if (age <= 75) {
            premiumRate = 0.05;
        } else {
            System.out.println("Insurance is not available for this age group.");
            sc.close();
            return;
        }
        double annualPremium = coverageAmount * premiumRate;
        System.out.println("\n===== Insurance Policy Details =====");
        System.out.println("Policy Holder   : " + name);
        System.out.println("Age             : " + age);
        System.out.println("Coverage Amount : ₹" + coverageAmount);
        System.out.println("Premium Rate    : " + (premiumRate * 100) + "%");
        System.out.println("Annual Premium  : ₹" + annualPremium);

        sc.close();
    }
}

