package com.codingseries41to60Days;
import java.util.Scanner;
public class HotelFoodBillSplitCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== Hotel Food Bill Split Calculator =====");
        System.out.print("Enter customer name: ");
        String name = sc.nextLine();
        System.out.print("Enter food bill amount: ₹");
        double foodBill = sc.nextDouble();
        System.out.print("Enter GST percentage: ");
        double gstPercentage = sc.nextDouble();
        System.out.print("Enter number of people: ");
        int people = sc.nextInt();
        if (foodBill < 0 || gstPercentage < 0 || people <= 0) {
            System.out.println("\n----- Invalid Input -----");
            System.out.println("Please enter valid bill, GST, and number of people.");
        } else {
            double gstAmount = foodBill * gstPercentage / 100;
            double totalBill = foodBill + gstAmount;
            double amountPerPerson = totalBill / people;
            System.out.println("\n----- HOTEL FOOD BILL -----");
            System.out.println("Customer Name     : " + name);
            System.out.printf("Food Bill         : ₹%.2f%n", foodBill);
            System.out.printf("GST Percentage    : %.2f%%%n", gstPercentage);
            System.out.printf("GST Amount        : ₹%.2f%n", gstAmount);
            System.out.printf("Total Bill        : ₹%.2f%n", totalBill);
            System.out.println("Number of People  : " + people);
            System.out.printf("Amount Per Person : ₹%.2f%n", amountPerPerson);
            System.out.println("\n--------------------------------------");
            System.out.println("Hotel bill split calculation completed.");
            System.out.println("--------------------------------------");
        }
        sc.close();
    }
}

