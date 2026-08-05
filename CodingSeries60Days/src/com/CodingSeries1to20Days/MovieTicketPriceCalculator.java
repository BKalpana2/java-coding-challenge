package com.CodingSeries1to20Days;

import java.util.Scanner;

public class MovieTicketPriceCalculator {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("=========================================");
        System.out.println("      MOVIE TICKET PRICE CALCULATOR");
        System.out.println("=========================================");

        System.out.print("Enter Movie Name : ");
        String movieName = s.nextLine();

        System.out.print("Enter Ticket Type (Regular/Premium) : ");
        String ticketType = s.nextLine();

        System.out.print("Enter Number of Tickets : ");
        int tickets = s.nextInt();

        double pricePerTicket = 0;

        // Determine ticket price
        if (ticketType.equalsIgnoreCase("Regular")) {
            pricePerTicket = 150;
        } else if (ticketType.equalsIgnoreCase("Premium")) {
            pricePerTicket = 250;
        } else {
            System.out.println("Invalid Ticket Type!");
            s.close();
            return;
        }

        double totalAmount = 0;
        double totalDiscount = 0;

        // Read age of each person
        for (int i = 1; i <= tickets; i++) {

            System.out.print("Enter Age of Person " + i + " : ");
            int age = s.nextInt();

            totalAmount += pricePerTicket;

            if (age >= 60) {
                totalDiscount += pricePerTicket * 0.20; // 20% discount
            } else if (age < 12) {
                totalDiscount += pricePerTicket * 0.50; // 50% discount
            }
        }

        double finalAmount = totalAmount - totalDiscount;

        // Print Bill
        System.out.println("\n=========================================");
        System.out.println("           MOVIE TICKET BILL");
        System.out.println("=========================================");
        System.out.println("Movie Name         : " + movieName);
        System.out.println("Ticket Type        : " + ticketType);
        System.out.println("Number of Tickets  : " + tickets);
        System.out.printf("Price Per Ticket   : ₹%.2f%n", pricePerTicket);
        System.out.printf("Total Amount       : ₹%.2f%n", totalAmount);
        System.out.printf("Total Discount     : ₹%.2f%n", totalDiscount);
        System.out.println("-----------------------------------------");
        System.out.printf("Final Amount       : ₹%.2f%n", finalAmount);
        System.out.println("=========================================");
        System.out.println("Thank You for Booking!");
        System.out.println("Enjoy Your Movie! 🎬");
        System.out.println("=========================================");

        s.close();
    }
}