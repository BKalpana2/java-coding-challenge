package com.CodingSeries21to40Days;
import java.util.Scanner;
public class CourierChargeCalculator {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter weight of parcel (in kg): ");
	        double weight = sc.nextDouble();
	        System.out.println("Enter distance (in km): ");
	        double distance = sc.nextDouble();
	        System.out.println("Choose Service Type:");
	        System.out.println("1. Standard (₹50 per kg + ₹5 per km)");
	        System.out.println("2. Express  (₹80 per kg + ₹10 per km)");
	        System.out.print("Enter your choice (1-2): ");
	        int choice = sc.nextInt();
	        double charge = 0;
	        switch (choice) {
	            case 1:
	                charge = (weight * 50) + (distance * 5);
	                break;
	            case 2:
	                charge = (weight * 80) + (distance * 10);
	                break;
	            default:
	                System.out.println("Invalid choice! Exiting...");
	                System.exit(0);
	        }
	        System.out.println("Do you want insurance? (₹100 flat) [yes=1 / no=0]: ");
	        int insurance = sc.nextInt();
	        if (insurance == 1) {
	            charge += 100;
	        }
	        System.out.println("\n--- Courier Charge Summary ---");
	        System.out.println("Weight: " + weight + " kg");
	        System.out.println("Distance: " + distance + " km");
	        System.out.println("Service Type: " + (choice == 1 ? "Standard" : "Express"));
	        if (insurance == 1) System.out.println("Insurance: ₹100");
	        System.out.println("Total Charge: ₹" + charge);
	        sc.close();
	    }
	}