package com.codingseries41to60Days;

import java.util.Scanner;
public class StudentScholarshipEligibilityChecker44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== Student Scholarship Eligibility Checker =====");
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        System.out.print("Enter student age: ");
        int age = sc.nextInt();
        System.out.print("Enter annual family income: ₹");
        double income = sc.nextDouble();
        System.out.print("Enter percentage: ");
        double percentage = sc.nextDouble();
        System.out.println("\n===== Scholarship Eligibility Result =====");
        System.out.println("Student Name : " + name);
        System.out.println("Age          : " + age);
        System.out.printf("Family Income: ₹%.2f%n", income);
        System.out.printf("Percentage   : %.2f%%%n", percentage);
        if (age >= 18 && percentage >= 75 && income <= 300000) {
            System.out.println("Status       : Eligible");
            System.out.println("Scholarship  : You are eligible for the scholarship.");
        } else {
            System.out.println("Status       : Not Eligible");
            if (age < 18) {
                System.out.println("Reason       : Minimum age requirement is 18 years.");
            } else if (percentage < 75) {
                System.out.println("Reason       : Minimum percentage requirement is 75%.");
            } else {
                System.out.println("Reason       : Family income exceeds ₹3,00,000.");
            }
        }
        System.out.println("==============================================");
        sc.close();
    }
}