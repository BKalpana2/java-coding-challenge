package com.codingseries41to60Days;
import java.util.Scanner;
public class ElectricitySubsidyCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== Electricity Subsidy Calculator =====");
        System.out.print("Enter consumer name: ");
        String name = sc.nextLine();
        System.out.print("Enter electricity units consumed: ");
        int units = sc.nextInt();
        double bill;
        double subsidy;
        if (units <= 100) 
            bill = units * 2.00;
        else if (units <= 200) 
            bill = (100 * 2.00) + ((units - 100) * 3.00);
         else 
            bill = (100 * 2.00) + (100 * 3.00)+ ((units - 200) * 4.00);
        if (units <= 100) {
            subsidy = bill * 0.50;
        } else if (units <= 200) {
            subsidy = bill * 0.30;
        } else 
            subsidy = bill * 0.10;
        double finalBill = bill - subsidy;
        System.out.println("\n----- ELECTRICITY BILL -----");
        System.out.println("Consumer Name       : " + name);
        System.out.println("Units Consumed      : " + units);
        System.out.printf("Original Bill       : ₹%.2f%n", bill);
        System.out.printf("Subsidy Amount      : ₹%.2f%n", subsidy);
        System.out.printf("Final Bill Amount   : ₹%.2f%n", finalBill);
        System.out.println("\n--------------------------------------");
        System.out.println("Electricity subsidy calculation completed.");
        System.out.println("--------------------------------------");
        sc.close();
    }
}
