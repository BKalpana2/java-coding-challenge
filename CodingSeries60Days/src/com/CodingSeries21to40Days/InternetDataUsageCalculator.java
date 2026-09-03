package com.CodingSeries21to40Days;

import java.util.Scanner;

public class InternetDataUsageCalculator {
    
	public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
        System.out.println("===== Internet Data Usage Calculator =====");
        System.out.print("Enter total data limit (GB): ");
        double limit = sc.nextDouble();
        System.out.print("Enter data used (GB): ");
        double used = sc.nextDouble();
        
        double remaining = limit - used;
        double usagePercentage = (used / limit) * 100;

        System.out.println("\n----- Data Usage Summary -----");
        System.out.println("Data Limit       : " + limit + " GB");
        System.out.println("Data Used        : " + used + " GB");
        System.out.println("Remaining Data   : " + remaining + " GB");
        System.out.printf("Usage Percentage : %.2f%%%n", usagePercentage);

        if (used > limit) {
            System.out.println("Status           : Data Limit Exceeded");
        } else if (usagePercentage >= 80) {
            System.out.println("Status           : Data Usage is High");
        } else {
            System.out.println("Status           : Data Usage is Normal");
        }

        sc.close();
    }
}
