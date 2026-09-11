package com.codingseries41to60Days;
import java.util.Scanner;
public class ExamResultAnalyzer43 {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        System.out.println("===== Exam Result Analyzer =====");
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        System.out.print("Enter marks in Java: ");
        double java = sc.nextDouble();
        System.out.print("Enter marks in Database: ");
        double database = sc.nextDouble();
        System.out.print("Enter marks in HTML: ");
        double html = sc.nextDouble();
        System.out.print("Enter marks in CSS: ");
        double css = sc.nextDouble();
        System.out.print("Enter marks in JavaScript: ");
        double javascript = sc.nextDouble();
        double total = java + database + html + css + javascript;
        double percentage = total / 5;
        String result;
        String grade;
        
        if (java < 35 || database < 35 || html < 35 ||
            css < 35 || javascript < 35) {
            result = "Fail";
            grade = "No Grade";
        } else {
            result = "Pass";
            if (percentage >= 90) {
                grade = "A+";
            } else if (percentage >= 80) {
                grade = "A";
            } else if (percentage >= 70) {
                grade = "B";
            } else if (percentage >= 60) {
                grade = "C";
            } else if (percentage >= 50) {
                grade = "D";
            } else {
                grade = "E";
            }
        }

        System.out.println("\n===== Exam Result =====");

        System.out.println("Student Name : " + name);
        System.out.println("Java         : " + java);
        System.out.println("Database     : " + database);
        System.out.println("HTML         : " + html);
        System.out.println("CSS          : " + css);
        System.out.println("JavaScript   : " + javascript);

        System.out.println("------------------------------");

        System.out.printf("Total Marks  : %.2f / 500%n", total);
        System.out.printf("Percentage   : %.2f%%%n", percentage);
        System.out.println("Result       : " + result);
        System.out.println("Grade        : " + grade);

        System.out.println("==============================");

        sc.close();
    }
}
