package com.CodingSeries21to40Days;

import java.util.Scanner;

public class EmployeeAttendanceCalculator {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter employee name : ");
        String name = s.nextLine();

        System.out.println("Enter total working days : ");
        int totalDays = s.nextInt();

        System.out.println("Enter days present : ");
        int presentDays = s.nextInt();

        if (totalDays <= 0 || presentDays < 0 || presentDays > 		totalDays) {
            System.out.println("Invalid input");
        } else {

            double attendance = (presentDays * 100.0) / 			totalDays;

            System.out.println("Employee Name : " + name);
            System.out.println("Total Working Days : " + 				totalDays);
            System.out.println("Days Present : " + 				presentDays);
            System.out.printf("Attendance Percentage : %.2f% 				%", attendance);
            System.out.println();
            if (attendance >= 75) {
                System.out.println("Status : Eligible");
            } else {
                System.out.println("Status : Not Eligible");
            }
        }

        s.close();
    }
}
