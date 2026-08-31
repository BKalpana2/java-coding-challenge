package com.CodingSeries21to40Days;
import java.util.Scanner;

public class TollGateFeeCalculator {
    public static void main(String[] args) {    	
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter vehicle type (Car/Bike/Truck/Bus): ");
        String vehicle = sc.nextLine();
        System.out.print("Enter number of toll gates crossed: ");
        int gates = sc.nextInt();
        double feePerGate = 0;
        if (vehicle.equalsIgnoreCase("Bike")) {
            feePerGate = 20;
        } else if (vehicle.equalsIgnoreCase("Car")) {
            feePerGate = 50;
        } else if (vehicle.equalsIgnoreCase("Bus")) {
            feePerGate = 100;
        } else if (vehicle.equalsIgnoreCase("Truck")) {
            feePerGate = 150;
        } else {
            System.out.println("Invalid vehicle type!");
            sc.close();
            return;
        }

        double totalFee = feePerGate * gates;

        System.out.println("\n----- Toll Fee Details -----");
        System.out.println("Vehicle Type       : " + vehicle);
        System.out.println("Toll Gates Crossed : " + gates);
        System.out.println("Fee Per Gate       : ₹" + feePerGate);
        System.out.println("Total Toll Fee     : ₹" + totalFee);

        sc.close();
    }
}
