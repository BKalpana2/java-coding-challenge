package com.CodingSeries21to40Days;
import java.util.Scanner;
public class HotelRoomRentCalculator {   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose Room Type:");
        System.out.println("1. Standard Room - ₹1500/day");
        System.out.println("2. Deluxe Room   - ₹2500/day");
        System.out.println("3. Suite Room    - ₹4000/day");
        System.out.print("Enter your choice (1-3): ");
        int choice = sc.nextInt();
        int rentPerDay = 0;
        switch (choice) {
            case 1: rentPerDay = 1500; break;
            case 2: rentPerDay = 2500; break;
            case 3: rentPerDay = 4000; break;
            default: 
                System.out.println("Invalid choice! Exiting...");
                System.exit(0);
        }
        System.out.print("Enter number of days: ");
        int days = sc.nextInt();
        System.out.println("Do you want to include breakfast? (₹300/day) [yes=1 / no=0]: ");
        int breakfast = sc.nextInt();
        System.out.println("Do you want to include airport pickup? (₹500 one-time) [yes=1 / no=0]: ");
        int pickup = sc.nextInt();
        int totalRent = (rentPerDay * days) 
                        + (breakfast == 1 ? 300 * days : 0) 
                        + (pickup == 1 ? 500 : 0);
        System.out.println("\n--- Hotel Rent Summary ---");
        System.out.println("Room Rent (" + days + " days): ₹" + (rentPerDay * days));
        if (breakfast == 1) System.out.println("Breakfast: ₹" + (300 * days));
        if (pickup == 1) System.out.println("Airport Pickup: ₹500");
        System.out.println("Total Rent: ₹" + totalRent);
        sc.close();
    }
}
