package com.codingseries41to60Days;
import java.util.Scanner;
public class PassportAgeVerification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== Passport Age Verification =====");
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("\n----- Verification Result -----");
        if (age >= 18) {

            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Minimum Age Requirement: 18");
            System.out.println("Age Verification: Passed");
            System.out.println("Status: Eligible");
            System.out.println("You meet the age requirement for passport application.");

        } else {

            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Minimum Age Requirement: 18");
            System.out.println("Age Verification: Not Passed");
            System.out.println("Status: Not Eligible");
            System.out.println("Reason: You are below the specified age requirement.");
        }

        System.out.println("\n--------------------------------------");
        System.out.println("Passport age verification completed.");
        System.out.println("--------------------------------------");

        sc.close();
    }
}
