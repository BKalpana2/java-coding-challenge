package com.CodingSeries1to20Days;
import java.util.Scanner;
public class OnlineShoppingBillGenerator {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int productId, quantity;
		String productName = "";
		double price = 0;
		double discount = 0;
		System.out.println("================================================");
		System.out.println("         ONLINE SHOPPING BILL GENERATOR");
		System.out.println("================================================");
		System.out.println("\nAvailable Products");
		System.out.println("-----------------------------------------------");
		System.out.println("1. Laptop                  ₹55000");
		System.out.println("2. Smartphone              ₹25000");
		System.out.println("3. Smart Watch             ₹4000");
		System.out.println("4. Bluetooth Headphones    ₹2500");
		System.out.println("5. Tablet                  ₹18000");
		System.out.println("6. Keyboard                ₹1200");
		System.out.println("7. Mouse                   ₹800");
		System.out.println("8. Power Bank              ₹1500");
		System.out.println("-----------------------------------------------");
		System.out.print("Enter Product ID : ");
		productId = s.nextInt();
		// Product Selection
		switch (productId) {
		case 1:
			productName = "Laptop";
			price = 55000;
			break;
		case 2:
			productName = "Smartphone";
			price = 25000;
			break;
		case 3:
			productName = "Smart Watch";
			price = 4000;
			break;
		case 4:
			productName = "Bluetooth Headphones";
			price = 2500;
			break;
		case 5:
			productName = "Tablet";
			price = 18000;
			break;
		case 6:
			productName = "Keyboard";
			price = 1200;
			break;
		case 7:
			productName = "Mouse";
			price = 800;
			break;
		case 8:
			productName = "Power Bank";
			price = 1500;
			break;
		default:
			System.out.println("Invalid Product ID!");
			s.close();
			return;
		}

		System.out.print("Enter Quantity : ");
		quantity = s.nextInt();
		double totalAmount = price * quantity;
		// Discount Calculation
		if (totalAmount < 10000) {
			discount = totalAmount * 0.05;
		} else if (totalAmount < 30000) {
			discount = totalAmount * 0.10;
		} else if (totalAmount < 50000) {
			discount = totalAmount * 0.15;
		} else {
			discount = totalAmount * 0.20;
		}
		double amountAfterDiscount = totalAmount - discount;
		// GST Calculation
		double gst = amountAfterDiscount * 0.18;
		double finalBill = amountAfterDiscount + gst;
		// Bill
		System.out.println("\n================================================");
		System.out.println("                 SHOPPING BILL");
		System.out.println("================================================");
		System.out.println("Product Name           : " + productName);
		System.out.printf("Price                  : ₹%.2f%n", price);
		System.out.println("Quantity               : " + quantity);
		System.out.printf("Total Amount           : ₹%.2f%n", totalAmount);
		System.out.printf("Discount               : ₹%.2f%n", discount);
		System.out.printf("Amount After Discount  : ₹%.2f%n", amountAfterDiscount);
		System.out.printf("GST (18%%)              : ₹%.2f%n", gst);
		System.out.println("-----------------------------------------------");
		System.out.printf("Final Bill Amount      : ₹%.2f%n", finalBill);
		System.out.println("================================================");
		System.out.println("        Thank You for Shopping!");
		System.out.println("            Visit Again 😊");
		System.out.println("================================================");
		s.close();
	}
}