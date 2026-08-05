package com.CodingSeries1to20Days;
import java.util.Scanner;
public class ElectricityBillCalculator {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
			System.out.println("===========ELECTRICITY BILL CALCULATION===========");
			System.out.print("Enter the Customer name : ");
			String name=s.nextLine();
			System.out.print("Enter the Customer ID : ");
			int id=s.nextInt();
			System.out.print("Enter the Units Consumed : ");
			int units=s.nextInt();
			double bill=0;
			double rate=0;
			if(units>=0&&units<=100) {
				rate=2.00;
				bill=units*rate;
				}
			else if(units>=101&&units<=200) {
				rate=3.50;
				bill=units*rate;
			}
			else if(units>=201&&units<=300) { 
				rate= 5.00;
				bill=units*rate;
			}
			else {
				rate=7.00;
				bill=units*rate;
			}
			if(units>0) {
				System.out.println("=======================");
				System.out.println("Electricity Bill");
				System.out.println("=======================");
				System.out.println("Customer Name : "+name);
				System.out.println("Customer ID : "+id);
				System.out.println("Units Consumed : "+units);
				System.out.println("Rate Applied : "+"₹"+rate +" Per unit");
				System.out.println("Total Bill Amount : "+ "₹"+bill);
				System.out.println("========================");
				System.out.println("Thank you ! Visit Again");
				System.out.println("========================");
			}
				else {
					System.out.println("Invalid Units");
				}
			s.close();
	}
}
