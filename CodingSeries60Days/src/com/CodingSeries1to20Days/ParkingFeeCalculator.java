package com.CodingSeries1to20Days;
import java.util.Scanner;
public class ParkingFeeCalculator {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("=============================================================");
		System.out.println("        PARKING FEE CALCULATOR");
		System.out.println("=============================================================");
		System.out.print("Enter the number of vehicles : ");
		int count = s.nextInt();
		s.nextLine();
		String[] vehicleNumber = new String[count];
		String[] type = new String[count];
		int[] hours = new int[count];
		double[] parkingFee = new double[count];
		double subtotal = 0.0;
		double gst;
		double grandTotal;
		for (int i = 0; i < count; i++) {
			System.out.println("-------------------------------------------------------------");
			System.out.println("Details of Vehicle " + (i + 1));
			System.out.print("Enter Vehicle Number : ");
			vehicleNumber[i] = s.nextLine();
			System.out.print("Enter Vehicle Type (Two Wheeler / Three Wheeler / Four Wheeler) : ");
			type[i] = s.nextLine();
			System.out.print("Enter Parking Hours : ");
			hours[i] = s.nextInt();
			s.nextLine();
			int ratePerHour = 0;
			if (type[i].equalsIgnoreCase("Two Wheeler")) {
				ratePerHour = 50;
			} 
			else if (type[i].equalsIgnoreCase("Three Wheeler")) {
				ratePerHour = 75;
			} 
			else if (type[i].equalsIgnoreCase("Four Wheeler")) {
				ratePerHour = 100;
			} 
			else {
				System.out.println("Invalid Vehicle Type! Parking fee set to ₹0.");
				ratePerHour = 0;
			}
			parkingFee[i] = hours[i] * ratePerHour;
			subtotal += parkingFee[i];
		}
		gst = subtotal * 0.18;
		grandTotal = subtotal + gst;
		System.out.println("\n==============================================================");
		System.out.println("                      PARKING RECEIPT");
		System.out.println("==============================================================");
		System.out.printf("%-20s %-18s %-10s %-12s%n",
				"Vehicle No", "Type", "Hours", "Fee");
		System.out.println("--------------------------------------------------------------");
		for (int i = 0; i < count; i++) {
			System.out.printf("%-20s %-18s %-10d ₹%-10.2f%n",
					vehicleNumber[i],
					type[i],
					hours[i],
					parkingFee[i]);
		}
		System.out.println("--------------------------------------------------------------");
		System.out.printf("%-35s ₹%.2f%n", "Subtotal", subtotal);
		System.out.printf("%-35s ₹%.2f%n", "GST (18%)", gst);
		System.out.printf("%-35s ₹%.2f%n", "Grand Total", grandTotal);
		System.out.println("==============================================================");
		System.out.println("        Thank You! Visit Again.");
		System.out.println("==============================================================");
		s.close();
	}
}