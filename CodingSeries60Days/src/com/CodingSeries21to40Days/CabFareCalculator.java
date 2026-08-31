package com.CodingSeries21to40Days;


import java.util.Scanner;

public class CabFareCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance travelled (in km): ");
        double distance = sc.nextDouble();

        double fare;

        if (distance <= 5) {
            fare = 50;
        } else if (distance <= 10) {
            fare = 50 + (distance - 5) * 10;
        } else {
            fare = 50 + (5 * 10) + (distance - 10) * 15;
        }

        System.out.println("Distance: " + distance + " km");
        System.out.println("Total Cab Fare: ₹" + fare);

        sc.close();
    }
}
