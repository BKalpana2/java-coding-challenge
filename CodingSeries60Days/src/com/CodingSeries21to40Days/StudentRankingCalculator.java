package com.CodingSeries21to40Days;
import java.util.Scanner;
public class StudentRankingCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        String[] names = new String[n];
        int[] marks = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter student name: ");
            names[i] = sc.next();

            System.out.print("Enter marks: ");
            marks[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (marks[i] < marks[j]) {
                    int tempMarks = marks[i];
                    marks[i] = marks[j];
                    marks[j] = tempMarks;
                    String tempName = names[i];
                    names[i] = names[j];
                    names[j] = tempName;
                }
            }
        }
        System.out.println("\n----- Student Rankings -----");
        for (int i = 0; i < n; i++) {
            System.out.println("Rank " + (i + 1) + ": "
                    + names[i] + " - " + marks[i]);
        }
        sc.close();
    }
}
