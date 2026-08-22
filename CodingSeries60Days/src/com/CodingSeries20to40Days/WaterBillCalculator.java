package com.CodingSeries20to40Days;
import java.util.Scanner;
public class WaterBillCalculator {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Customer ID: ");
        int id = sc.nextInt();
        System.out.print("Enter Water Units Consumed: ");
        int units = sc.nextInt();
        double bill;
        if (units <= 100) 
            bill = units * 2.00;
        else if (units <= 200) 
            bill = (100 * 2.00) + ((units - 100) * 3.00);
        else if (units <= 300) {
            bill = (100 * 2.00) + (100 * 3.00)
                    + ((units - 200) * 5.00);
        } 
        else {
            bill = (100 * 2.00) + (100 * 3.00)
                    + (100 * 5.00)
                    + ((units - 300) * 7.00);
        }
        double serviceCharge = 50.00;
        double totalBill = bill + serviceCharge;
        System.out.println("\n========== WATER BILL ==========");
        System.out.println("Customer Name : " + name);
        System.out.println("Customer ID   : " + id);
        System.out.println("Units Used    : " + units);
        System.out.printf("Water Charge  : ₹%.2f%n", bill);
        System.out.printf("Service Charge: ₹%.2f%n", 			serviceCharge);
        System.out.printf("Total Bill    : ₹%.2f%n", 			totalBill);
        System.out.println("================================");
        sc.close();
    } }
