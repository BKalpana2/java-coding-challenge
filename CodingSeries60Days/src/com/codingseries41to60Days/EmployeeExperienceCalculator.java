package com.codingseries41to60Days;
import java.util.Scanner;
public class EmployeeExperienceCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== Employee Experience Calculator =====");
        System.out.print("Enter employee name: ");
        String name = sc.nextLine();
        System.out.print("Enter joining year: ");
        int joiningYear = sc.nextInt();
        System.out.print("Enter current year: ");
        int currentYear = sc.nextInt();
        if (joiningYear <= 0 || currentYear <= 0 || joiningYear > currentYear) {
            System.out.println("\n----- Invalid Input -----");
            System.out.println("Please enter valid joining and current years.");
        } else {
            int experience = currentYear - joiningYear;
            System.out.println("\n----- EMPLOYEE EXPERIENCE DETAILS -----");
            System.out.println("Employee Name     : " + name);
            System.out.println("Joining Year      : " + joiningYear);
            System.out.println("Current Year      : " + currentYear);
            System.out.println("Experience        : " + experience + " years");
            if (experience == 0) {
                System.out.println("Experience Level  : Fresher");
            } else if (experience <= 2) {
                System.out.println("Experience Level  : Junior Employee");
            } else if (experience <= 5) {
                System.out.println("Experience Level  : Mid-Level Employee");
            } else {
                System.out.println("Experience Level  : Senior Employee");
            }
            System.out.println("\n--------------------------------------");
            System.out.println("Employee experience calculation completed.");
            System.out.println("--------------------------------------");
        }
        sc.close();
    }
}