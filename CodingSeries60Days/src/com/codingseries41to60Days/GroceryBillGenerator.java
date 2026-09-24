package com.codingseries41to60Days;
import java.util.Scanner;
public class GroceryBillGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== Grocery Bill Generator =====");
        System.out.print("Enter customer name: ");
        String name = sc.nextLine();
        System.out.print("Enter grocery item 1 name: ");
        String item1 = sc.nextLine();
        System.out.print("Enter quantity of item 1: ");
        int quantity1 = sc.nextInt();
        System.out.print("Enter price of item 1: ₹");
        double price1 = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter grocery item 2 name: ");
        String item2 = sc.nextLine();
        System.out.print("Enter quantity of item 2: ");
        int quantity2 = sc.nextInt();
        System.out.print("Enter price of item 2: ₹");
        double price2 = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter grocery item 3 name: ");
        String item3 = sc.nextLine();
        System.out.print("Enter quantity of item 3: ");
        int quantity3 = sc.nextInt();
        System.out.print("Enter price of item 3: ₹");
        double price3 = sc.nextDouble();
        if (quantity1 <= 0 || quantity2 <= 0 || quantity3 <= 0
                || price1 <= 0 || price2 <= 0 || price3 <= 0) {
            System.out.println("\n----- Invalid Input -----");
            System.out.println("Quantity and price must be greater than zero.");
        } else {
            double total1 = quantity1 * price1;
            double total2 = quantity2 * price2;
            double total3 = quantity3 * price3;
            double subtotal = total1 + total2 + total3;
            double discount;
            if (subtotal >= 2000) {
                discount = subtotal * 0.15;
            } else if (subtotal >= 1000) {
                discount = subtotal * 0.10;
            } else {
                discount = 0;
            }
            double finalBill = subtotal - discount;
            System.out.println("\n========== GROCERY BILL ==========");
            System.out.println("Customer Name : " + name);
            System.out.println("\nItem Details");
            System.out.println("--------------------------------------");
            System.out.println("Item          : " + item1);
            System.out.println("Quantity      : " + quantity1);
            System.out.printf("Price         : ₹%.2f%n", price1);
            System.out.printf("Item Total    : ₹%.2f%n", total1);
            System.out.println("--------------------------------------");
            System.out.println("Item          : " + item2);
            System.out.println("Quantity      : " + quantity2);
            System.out.printf("Price         : ₹%.2f%n", price2);
            System.out.printf("Item Total    : ₹%.2f%n", total2);
            System.out.println("--------------------------------------");
            System.out.println("Item          : " + item3);
            System.out.println("Quantity      : " + quantity3);
            System.out.printf("Price         : ₹%.2f%n", price3);
            System.out.printf("Item Total    : ₹%.2f%n", total3);
            System.out.println("--------------------------------------");
            System.out.printf("Subtotal      : ₹%.2f%n", subtotal);
            System.out.printf("Discount      : ₹%.2f%n", discount);
            System.out.printf("Final Bill    : ₹%.2f%n", finalBill);
            System.out.println("--------------------------------------");
            System.out.println("Grocery bill generation completed.");
            System.out.println("--------------------------------------");
        }
        sc.close();
    }
}