package com.CodingSeries20to40Days;
import java.util.Scanner;
public class TrainSeatEligibilityChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("========== TRAIN SEAT ELIGIBILITY CHECKER ==========");
        System.out.print("Enter passenger name: ");
        String name = sc.nextLine();
        System.out.print("Enter passenger age: ");
        int age = sc.nextInt();
        System.out.print("Enter seat availability (yes/no): ");
        String availability = sc.next();
        System.out.println("\n-----------------------------------------------------");
        System.out.println("Passenger Name     : " + name);
        System.out.println("Passenger Age      : " + age);
        System.out.println("Seat Availability  : " + availability);
        System.out.println("Age Requirement    : 18 or above");
        if (age >= 18 && availability.equalsIgnoreCase("yes")) {
            System.out.println("Seat Status        : Available");
            System.out.println("Eligibility Status : ELIGIBLE");
            System.out.println("Booking Status     : You can book the train seat.");
        } else if (age < 18) {
            System.out.println("Seat Status        : Available");
            System.out.println("Eligibility Status : NOT ELIGIBLE");
            System.out.println("Reason             : Passenger age is below 18.");
        } else {
            System.out.println("Seat Status        : Not Available");
            System.out.println("Eligibility Status : NOT ELIGIBLE");
            System.out.println("Reason             : No seats are currently available.");
        }
        System.out.println("-----------------------------------------------------");
        System.out.println("Thank you for using Train Seat Eligibility Checker!");
        System.out.println("Have a safe and happy journey. 🚆");
        System.out.println("=====================================================");
        sc.close();
    }
}