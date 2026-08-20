package com.CodingSeries1to20Days;

import java.util.Scanner;

public class AttendancePercentageCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of classes: ");
        int totalClasses = sc.nextInt();

        System.out.print("Enter number of classes attended: ");
        int attendedClasses = sc.nextInt();

        double percentage = (attendedClasses * 100.0) / totalClasses;
        
        System.out.println();

        System.out.println("Attendance Percentage: " + percentage + "%");

        if (percentage >= 75) {
            System.out.println("Eligible for examination.");
        } else {
            System.out.println("Not eligible for examination.");
        }

        sc.close();
    }
}
