package com.CodingSeries1to20Days;
import java.util.Scanner;
public class MobileRechargePlanSelector {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("========================================");
        System.out.println("       MOBILE RECHARGE PLAN SELECTOR");
        System.out.println("========================================");
        System.out.println("Available Plans:");
        System.out.println("1. ₹199 - 1GB/Day - 28 Days");
        System.out.println("2. ₹299 - 1.5GB/Day - 28 Days");
        System.out.println("3. ₹399 - 2GB/Day - 28 Days");
        System.out.println("4. ₹499 - 2.5GB/Day - 56 Days");
        System.out.println("5. ₹599 - 3GB/Day - 56 Days");
        System.out.println("----------------------------------------");
        System.out.print("Enter your choice (1-5): ");
        int choice = s.nextInt();
        String plan = "";
        int price = 0;
        String data = "";
        int validity = 0;
        switch (choice) {
        case 1:
            plan = "Basic Plan";
            price = 199;
            data = "1GB/Day";
            validity = 28;
            break;
        case 2:
            plan = "Smart Plan";
            price = 299;
            data = "1.5GB/Day";
            validity = 28;
            break;
        case 3:
            plan = "Premium Plan";
            price = 399;
            data = "2GB/Day";
            validity = 28;
            break;
        case 4:
            plan = "Super Plan";
            price = 499;
            data = "2.5GB/Day";
            validity = 56;
            break;
        case 5:
            plan = "Unlimited Plan";
            price = 599;
            data = "3GB/Day";
            validity = 56;
            break;
        default:
            System.out.println("Invalid choice!");
            s.close();
            return;
        }
        System.out.println("\n========================================");
        System.out.println("          RECHARGE DETAILS");
        System.out.println("========================================");
        System.out.println("Plan Name : " + plan);
        System.out.println("Price     : ₹" + price);
        System.out.println("Data      : " + data);
        System.out.println("Validity  : " + validity + " Days");
        System.out.println("----------------------------------------");
        System.out.println("Recharge Successful!");
        System.out.println("Thank you for choosing our plan.");
        System.out.println("========================================");
        s.close();
    }
}