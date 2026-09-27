package com.codingseries41to60Days;
import java.util.Scanner;
public class DigitalClockTimeFormatter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== Digital Clock Time Formatter =====");
        System.out.print("Enter hour (0-23): ");
        int hour = sc.nextInt();
        System.out.print("Enter minute (0-59): ");
        int minute = sc.nextInt();
        System.out.print("Enter second (0-59): ");
        int second = sc.nextInt();
        if (hour < 0 || hour > 23 ||
            minute < 0 || minute > 59 ||
            second < 0 || second > 59) {
            System.out.println("\n----- Invalid Time -----");
            System.out.println("Please enter a valid time.");
        } else {
            String period;
            if (hour < 12) {
                period = "AM";
            } else 
                period = "PM";
            int displayHour = hour % 12;
            if (displayHour == 0) {
                displayHour = 12;
            }
            System.out.println("\n----- DIGITAL CLOCK -----");
            System.out.printf("24-Hour Format : %02d:%02d:%02d%n",
                    hour, minute, second);
            System.out.printf("12-Hour Format : %02d:%02d:%02d %s%n",
                    displayHour, minute, second, period);
            System.out.println("\n--------------------------------------");
            System.out.println("Digital clock time formatting completed.");
            System.out.println("--------------------------------------");
        }
        sc.close();
    }
}
