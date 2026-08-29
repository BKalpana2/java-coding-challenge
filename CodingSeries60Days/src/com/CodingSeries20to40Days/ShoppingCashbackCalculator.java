package com.CodingSeries20to40Days;
import java.util.Scanner;
public class ShoppingCashbackCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("       SHOPPING CASHBACK CALCULATOR");
        System.out.println("========================================");
        System.out.print("Enter customer name: ");
        String name = sc.nextLine();
        System.out.print("Enter shopping amount: ");
        double amount = sc.nextDouble();
        double cashbackRate;
        if (amount >= 5000) {
            cashbackRate = 0.20;
        } else if (amount >= 3000) {
            cashbackRate = 0.15;
        } else if (amount >= 1000) {
            cashbackRate = 0.10;
        } else {
            cashbackRate = 0.05;
        }double cashback = amount * cashbackRate;
        double finalAmount = amount - cashback;
        System.out.println();
        System.out.println("----------------------------------------");
        System.out.println("             BILL SUMMARY");
        System.out.println("----------------------------------------");
        System.out.printf("Customer Name       : %s%n", name);
        System.out.printf("Shopping Amount     : ₹%.2f%n", amount);
        System.out.printf("Cashback Percentage : %.0f%%%n", cashbackRate * 100);
        System.out.printf("Cashback Earned     : ₹%.2f%n", cashback);
        System.out.println("----------------------------------------");
        System.out.printf("Final Amount        : ₹%.2f%n", finalAmount);
        System.out.println("----------------------------------------");
        System.out.printf(" Congratulations %s!%n", name);
        System.out.printf("You have earned ₹%.2f cashback.%n", cashback);
        System.out.println();
        System.out.println("Thank you for shopping with us!");
        System.out.println("========================================");
        sc.close();
    }
}
