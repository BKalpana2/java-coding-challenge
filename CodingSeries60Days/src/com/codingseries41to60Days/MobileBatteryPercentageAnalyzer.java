package com.codingseries41to60Days;
import java.util.Scanner;
public class MobileBatteryPercentageAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== Mobile Battery Percentage Analyzer =====");
        System.out.print("Enter mobile model: ");
        String mobile = sc.nextLine();
        System.out.print("Enter battery percentage: ");
        int battery = sc.nextInt();
        System.out.println("\n----- BATTERY ANALYSIS -----");
        System.out.println("Mobile Model : " + mobile);
        System.out.println("Battery      : " + battery + "%");
        if (battery < 0 || battery > 100) {
            System.out.println("Status       : Invalid");
            System.out.println("Message      : Please enter a battery percentage between 0 and 100.");
        } else if (battery <= 10) {
            System.out.println("Status       : Critical");
            System.out.println("Message      : Battery is critically low. Charge your mobile immediately.");
        } else if (battery <= 30) {
            System.out.println("Status       : Low");
            System.out.println("Message      : Battery is low. Consider charging your mobile.");
        } else if (battery <= 60) {
            System.out.println("Status       : Moderate");
            System.out.println("Message      : Battery level is moderate.");
        } else if (battery <= 90) {
            System.out.println("Status       : Good");
            System.out.println("Message      : Battery level is good.");
        } else {
            System.out.println("Status       : Full");
            System.out.println("Message      : Battery level is almost or completely full.");
        }
        System.out.println("\n--------------------------------------");
        System.out.println("Battery analysis completed.");
        System.out.println("--------------------------------------");
        sc.close();
    }
}
