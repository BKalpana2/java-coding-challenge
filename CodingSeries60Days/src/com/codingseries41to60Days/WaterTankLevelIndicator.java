package com.codingseries41to60Days;
import java.util.Scanner;
public class WaterTankLevelIndicator {
    public static void main(String[] args) {    	
        Scanner sc = new Scanner(System.in);
        System.out.println("===== Water Tank Level Indicator =====");
        System.out.print("Enter tank capacity (in liters): ");
        double capacity = sc.nextDouble();
        System.out.print("Enter current water level (in liters): ");
        double currentLevel = sc.nextDouble();
        if (capacity <= 0 || currentLevel < 0 || currentLevel > capacity) {
            System.out.println("\n----- Invalid Input -----");
            System.out.println("Please enter a valid water level.");
            System.out.println("Current level must be between 0 and tank capacity.");
        } else {
            double percentage = (currentLevel / capacity) * 100;
            String status;
            if (percentage <= 20) {
                status = "Very Low";
            } else if (percentage <= 40) {
                status = "Low";
            } else if (percentage <= 70) {
                status = "Medium";
            } else if (percentage < 100) {
                status = "High";
            } else 
                status = "Full";
            System.out.println("\n----- WATER TANK STATUS -----");
            System.out.printf("Tank Capacity       : %.2f L%n", capacity);
            System.out.printf("Current Water Level : %.2f L%n", currentLevel);
            System.out.printf("Water Level         : %.2f%%%n", percentage);
            System.out.println("Tank Status         : " + status);
            if (percentage <= 20) {
                System.out.println("Alert               : Water level is very low.");
            } else if (percentage <= 40) {
                System.out.println("Alert               : Water level is low.");
            } else if (percentage <= 70) {
                System.out.println("Alert               : Water level is at a medium level.");
            } else if (percentage < 100) {
                System.out.println("Alert               : Water level is high.");
            } else 
                System.out.println("Alert               : Tank is completely full.");
        }
        System.out.println("\n--------------------------------------");
        System.out.println("Water tank level checking completed.");
        System.out.println("--------------------------------------");
        sc.close();
    }
}
