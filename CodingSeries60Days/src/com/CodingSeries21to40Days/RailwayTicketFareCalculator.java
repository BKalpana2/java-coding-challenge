package com.CodingSeries21to40Days;
import java.util.Scanner;

public class RailwayTicketFareCalculator {
	    public static void main(String[] args) {	       
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter passenger name: ");
	        String name = sc.nextLine();
	        System.out.print("Enter passenger age: ");
	        int age = sc.nextInt();
	        int fare;
	        String category;
	       
	        if (age < 5) {
	            fare = 0;
	            category = "Child (Free)";
	        } else if (age <= 12) {
	            fare = 50;
	            category = "Child";
	        } else if (age < 60) {
	            fare = 100;
	            category = "Adult";
	        } else {
	            fare = 70;
	            category = "Senior Citizen";
	        }
	        System.out.println("\n========== Railway Ticket ==========");
	        System.out.println("Passenger Name : " + name);
	        System.out.println("Passenger Age  : " + age);
	        System.out.println("Category       : " + category);
	        System.out.println("Ticket Fare    : ₹" + fare);
	        System.out.println("====================================");
	        System.out.println("        Thank You! Happy Journey");
	        System.out.println("====================================");
	        sc.close();
	    }
	}
