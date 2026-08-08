package com.CodingSeries1to20Days;
import java.util.Scanner;

public class RestaurantBillGeneratorwithGST {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("==============================================");
		System.out.println("   RESTAURANT BILL GENERATOR");
		System.out.println("==============================================");

		System.out.print("Enter the customer name : ");
		String name = s.nextLine();

		System.out.print("Enter table number : ");
		int number = s.nextInt();

		System.out.print("Enter the number of items : ");
		int item = s.nextInt();
		// Arrays to store item details
		String[] itemName = new String[item];
		int[] quantity = new int[item];
		double[] price = new double[item];
		double[] total = new double[item];
		double subTotal = 0;

		// Input
		for (int i = 0; i < item; i++) {
			s.nextLine();
			System.out.print("Enter Item " + (i + 1) + " Name : ");
			itemName[i] = s.nextLine();
			System.out.print("Enter Quantity : ");
			quantity[i] = s.nextInt();
			System.out.print("Enter Price : ");
			price[i] = s.nextDouble();
			total[i] = quantity[i] * price[i];
			subTotal += total[i];
		}

		double gst = subTotal * 0.05;
		double grandTotal = subTotal + gst;

		// Bill
		System.out.println("\n==============================================");
		System.out.println("             RESTAURANT BILL");
		System.out.println("==============================================");
		System.out.println("Customer : " + name);
		System.out.println("Table No : " + number);
		System.out.println("---------------------------------------------------------------");
		System.out.printf("%-20s %-10s %-10s %-10s%n", "Item", "Qty", "Price", "Total");
		System.out.println("---------------------------------------------------------------");
		for (int i = 0; i < item; i++) {
			System.out.printf("%-20s %-10d %-10.2f %-10.2f%n",
					itemName[i],
					quantity[i],
					price[i],
					total[i]);
		}
		System.out.println("---------------------------------------------------------------");   
		System.out.printf("%-30s ₹%.2f%n", "Subtotal", subTotal);
		System.out.printf("%-30s ₹%.2f%n", "GST (5%)", gst);
		System.out.printf("%-30s ₹%.2f%n", "Grand Total", grandTotal);
		System.out.println("---------------------------------------------------------------");
		System.out.println("        Thank You! Visit Again 😊");
		s.close();
	}
}