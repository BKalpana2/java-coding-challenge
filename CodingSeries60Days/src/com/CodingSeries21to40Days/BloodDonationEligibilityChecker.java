package com.CodingSeries21to40Days;
import java.util.Scanner;
public class BloodDonationEligibilityChecker {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("======================================");
        System.out.println("     BLOOD DONATION ELIGIBILITY");
        System.out.println("======================================");
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.print("Enter your weight (kg): ");
        double weight = sc.nextDouble();
        System.out.println("\n---------- Eligibility Details ----------");
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age + " years");
        System.out.println("Weight : " + weight + " kg");
        if (age < 18) {
            System.out.println("Status : Not Eligible");
            System.out.println("Reason : Minimum age requirement is 18 years.");
        } else if (age > 65) {
            System.out.println("Status : Not Eligible");
            System.out.println("Reason : Maximum age considered is 65 years.");
        } else if (weight < 50) {
            System.out.println("Status : Not Eligible");
            System.out.println("Reason : Minimum weight requirement is 50 kg.");
        } else {
            System.out.println("Status : Eligible");
            System.out.println("You can donate blood based on the given criteria.");
        }
        System.out.println("======================================");

        sc.close();
    }
}
