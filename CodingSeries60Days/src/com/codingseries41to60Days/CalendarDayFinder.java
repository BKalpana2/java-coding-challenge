package com.codingseries41to60Days;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class CalendarDayFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== Calendar Day Finder =====");
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter day: ");
        int day = sc.nextInt();
        try {
            LocalDate date = LocalDate.of(year, month, day);
            DayOfWeek dayOfWeek = date.getDayOfWeek();
            System.out.println("\n----- CALENDAR DAY RESULT -----");
            System.out.println("Date      : " + date);
            System.out.println("Day       : " + dayOfWeek);
            System.out.println("Day Number: " + dayOfWeek.getValue());

            System.out.println("\n--------------------------------------");
            System.out.println("Calendar day finding completed.");
            System.out.println("--------------------------------------");

        } catch (Exception e) {

            System.out.println("\n----- Invalid Date -----");
            System.out.println("Please enter a valid calendar date.");
        }

        sc.close();
    }
}
