package com.CodingSeries21to40Days;
import java.util.Scanner;
public class SalaryTaxDeductionCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your annual salary: ");
        double salary = sc.nextDouble();
        double tax = 0;
        double tax1 = 0;
        double tax2 = 0;
        double tax3 = 0;
        if (salary <= 250000) {
            tax = 0;
        } else if (salary <= 500000) {
            tax1 = (salary - 250000) * 0.05;
            tax = tax1;
        } else if (salary <= 1000000) {
            tax1 = 250000 * 0.05;
            tax2 = (salary - 500000) * 0.20;
            tax = tax1 + tax2;
        } else {

            tax1 = 250000 * 0.05;
            tax2 = 500000 * 0.20;
            tax3 = (salary - 1000000) * 0.30;

            tax = tax1 + tax2 + tax3;
        }
        double netSalary = salary - tax;
        System.out.println();
        System.out.println("========================================");
        System.out.println("       SALARY TAX DEDUCTION DETAILS");
        System.out.println("========================================");
        System.out.printf("Annual Salary       : ₹%.2f%n", salary);
        System.out.println();
        System.out.println("Tax Calculation:");
        if (salary <= 250000) {

            System.out.println("Tax Slab Applied    : Up to ₹2,50,000");
            System.out.println("Tax Rate            : 0%");

        } else if (salary <= 500000) {

            System.out.println("Tax Slab Applied    : ₹2,50,001 - ₹5,00,000");
            System.out.println("Tax Rate            : 5%");
            System.out.printf("Tax Amount          : ₹%.2f%n", tax1);

        } else if (salary <= 1000000) {

            System.out.println("Tax Slab Applied    : ₹5,00,001 - ₹10,00,000");
            System.out.println("Tax Rate            : 20%");
            System.out.printf("Tax on First Slab   : ₹%.2f%n", tax1);
            System.out.printf("Tax on Second Slab  : ₹%.2f%n", tax2);

        } else {

            System.out.println("Tax Slab Applied    : Above ₹10,00,000");
            System.out.println("Tax Rate            : 30%");
            System.out.printf("Tax on First Slab   : ₹%.2f%n", tax1);
            System.out.printf("Tax on Second Slab  : ₹%.2f%n", tax2);
            System.out.printf("Tax on Remaining    : ₹%.2f%n", tax3);
        }
        System.out.println("----------------------------------------");
        System.out.printf("Total Tax Deduction : ₹%.2f%n", tax);
        System.out.println("----------------------------------------");
        System.out.printf("Annual Salary       : ₹%.2f%n", salary);
        System.out.printf("Net Salary          : ₹%.2f%n", netSalary);
        System.out.println("========================================");
        sc.close();
    }
}
