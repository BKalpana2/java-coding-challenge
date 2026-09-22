package com.codingseries41to60Days;
import java.util.Scanner;
public class SpeedFineCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== Speed Fine Calculator =====");
        System.out.print("Enter vehicle number: ");
        String vehicleNumber = sc.nextLine();
        System.out.print("Enter speed limit (km/h): ");
        double speedLimit = sc.nextDouble();
        System.out.print("Enter vehicle speed (km/h): ");
        double speed = sc.nextDouble();
        double excessSpeed = speed - speedLimit;
        double fine = 0;
        if (speed <= speedLimit) {
            fine = 0;
        } else if (excessSpeed <= 10) {
            fine = 500;
        } else if (excessSpeed <= 20) {
            fine = 1000;
        } else if (excessSpeed <= 40) {
            fine = 2000;
        } else 
            fine = 3000;
        System.out.println("\n----- SPEED FINE RESULT -----");
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.printf("Speed Limit    : %.2f km/h%n", speedLimit);
        System.out.printf("Vehicle Speed  : %.2f km/h%n", speed);
        if (speed <= speedLimit) {
            System.out.println("Status         : Within Speed Limit");
            System.out.println("Fine           : ₹0.00");
            System.out.println("Message        : No speeding fine applicable.");
        } else {
            System.out.printf("Excess Speed   : %.2f km/h%n", excessSpeed);
            System.out.println("Status         : Speed Limit Exceeded");
            System.out.printf("Fine           : ₹%.2f%n", fine);
            System.out.println("Message        : Speeding fine is applicable.");
        }
        System.out.println("\n--------------------------------------");
        System.out.println("Speed fine calculation completed.");
        System.out.println("--------------------------------------");
        sc.close();
    }
}
