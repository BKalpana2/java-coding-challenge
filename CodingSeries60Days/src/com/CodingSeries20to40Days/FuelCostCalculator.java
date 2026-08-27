package com.CodingSeries20to40Days;

import java.util.Scanner;

public class FuelCostCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance travelled (km): ");
        double distance = sc.nextDouble();

        System.out.print("Enter mileage (km/l): ");
        double mileage = sc.nextDouble();

        System.out.print("Enter fuel price per litre: ");
        double fuelPrice = sc.nextDouble();

        double fuelRequired = distance / mileage;
        double totalCost = fuelRequired * fuelPrice;

        System.out.println("\n----- Fuel Cost Details -----");
        System.out.printf("Distance Travelled : %.2f km%n", distance);
        System.out.printf("Fuel Required      : %.2f litres%n", fuelRequired);
        System.out.printf("Fuel Price         : ₹%.2f/litre%n", fuelPrice);
        System.out.printf("Total Fuel Cost    : ₹%.2f%n", totalCost);

        sc.close();
    }
}
