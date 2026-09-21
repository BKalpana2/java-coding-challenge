package com.codingseries41to60Days;
import java.util.Scanner;
public class FuelMileageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== Fuel Mileage Calculator =====");
        System.out.print("Enter vehicle name: ");
        String vehicleName = sc.nextLine();
        System.out.print("Enter distance traveled (in km): ");
        double distance = sc.nextDouble();
        System.out.print("Enter fuel consumed (in liters): ");
        double fuel = sc.nextDouble();
        System.out.print("Enter fuel price per liter: ₹");
        double fuelPrice = sc.nextDouble();
        if (distance <= 0 || fuel <= 0 || fuelPrice <= 0) {
            System.out.println("\n----- Invalid Input -----");
            System.out.println("Distance, fuel, and fuel price must be greater than zero.");
        } else {
            double mileage = distance / fuel;
            double totalFuelCost = fuel * fuelPrice;
            double costPerKm = totalFuelCost / distance;
            System.out.println("\n----- FUEL MILEAGE RESULT -----");
            System.out.println("Vehicle Name       : " + vehicleName);
            System.out.printf("Distance Traveled  : %.2f km%n", distance);
            System.out.printf("Fuel Consumed      : %.2f L%n", fuel);
            System.out.printf("Fuel Price         : ₹%.2f/L%n", fuelPrice);
            System.out.printf("Mileage            : %.2f km/L%n", mileage);
            System.out.printf("Total Fuel Cost    : ₹%.2f%n", totalFuelCost);
            System.out.printf("Fuel Cost per Km   : ₹%.2f%n", costPerKm);
            System.out.println("\n--------------------------------------");
            System.out.println("Fuel mileage calculation completed.");
            System.out.println("--------------------------------------");
        }
        sc.close();
    }
}
