package com.codingseries41to60Days;
import java.util.Scanner;
public class OnlineFoodOrderBillCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== Online Food Order Bill Calculator =====");
        System.out.print("Enter customer name: ");
        String name = sc.nextLine();
        System.out.print("Enter food item name: ");
        String foodItem = sc.nextLine();
        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();
        System.out.print("Enter price per item: ₹");
        double price = sc.nextDouble();
        if (quantity <= 0 || price <= 0) {
            System.out.println("\n----- Invalid Input -----");
            System.out.println("Quantity and price must be greater than zero.");
        } else {
            double itemTotal = quantity * price;
            double deliveryCharge;
            if (itemTotal >= 500) {
                deliveryCharge = 0;
            } else 
                deliveryCharge = 40;
            double discount;
            if (itemTotal >= 1000) {
                discount = itemTotal * 0.20;
            } else if (itemTotal >= 500) {
                discount = itemTotal * 0.10;
            } else 
                discount = 0;
            double finalBill = itemTotal - discount + deliveryCharge;
            System.out.println("\n----- FOOD ORDER BILL -----");
            System.out.println("Customer Name       : " + name);
            System.out.println("Food Item           : " + foodItem);
            System.out.println("Quantity             : " + quantity);
            System.out.printf("Price Per Item      : ₹%.2f%n", price);
            System.out.printf("Item Total          : ₹%.2f%n", itemTotal);
            System.out.printf("Discount            : ₹%.2f%n", discount);
            System.out.printf("Delivery Charge     : ₹%.2f%n", deliveryCharge);
            System.out.printf("Final Bill Amount   : ₹%.2f%n", finalBill);
            System.out.println("\n--------------------------------------");
            System.out.println("Food order bill calculation completed.");
            System.out.println("--------------------------------------");
        }
        sc.close();
    }
}
