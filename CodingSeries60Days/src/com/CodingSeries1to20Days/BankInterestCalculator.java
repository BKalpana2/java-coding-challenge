package com.CodingSeries1to20Days;

import java.util.Scanner;

public class BankInterestCalculator {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("       BANK INTEREST CALCULATOR");
        System.out.println("====================================");

        System.out.print("Enter Principal Amount : ₹ ");
        double principal = s.nextDouble();

        System.out.print("Enter Rate of Interest : ");
        double rate = s.nextDouble();

        System.out.print("Enter Time (in years) : ");
        double time = s.nextDouble();

        double simpleInterest = (principal * rate * time) / 100;
        double totalAmount = principal + simpleInterest;

        System.out.println("------------------------------------");
        System.out.printf("Principal Amount : ₹ %.2f%n", principal);
        System.out.printf("Interest Earned  : ₹ %.2f%n", simpleInterest);
        System.out.printf("Total Amount     : ₹ %.2f%n", totalAmount);
        System.out.println("====================================");

        s.close();
    }
}