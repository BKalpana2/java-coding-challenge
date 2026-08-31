package com.CodingSeries21to40Days;
import java.util.Scanner;
public class MovieSeatBookingCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("========== MOVIE SEAT BOOKING CALCULATOR ==========");
        System.out.print("Enter movie name: ");
        String movieName = sc.nextLine();
        System.out.print("Enter total number of seats: ");
        int totalSeats = sc.nextInt();
        System.out.print("Enter number of seats already booked: ");
        int bookedSeats = sc.nextInt();
        System.out.print("Enter number of seats you want to book: ");
        int seatsToBook = sc.nextInt();
        int availableSeats = totalSeats - bookedSeats;
        System.out.println("\n---------- BOOKING DETAILS ----------");
        System.out.println("Movie Name       : " + movieName);
        System.out.println("Total Seats      : " + totalSeats);
        System.out.println("Already Booked   : " + bookedSeats);
        System.out.println("Available Seats  : " + availableSeats);
        if (seatsToBook <= 0) {
            System.out.println("Invalid number of seats!");
        } 
        else if (seatsToBook <= availableSeats) {
            int remainingSeats = availableSeats - seatsToBook;
            System.out.println("Seats Booked     : " + seatsToBook);
            System.out.println("Booking Status   : Booking Successful");
            System.out.println("Remaining Seats  : " + remainingSeats);
        } 
        else {
            System.out.println("Booking Status   : Booking Failed");
            System.out.println("Reason           : Not enough seats available");
        }
        sc.close();
    }
}


