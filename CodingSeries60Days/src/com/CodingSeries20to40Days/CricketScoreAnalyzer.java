package com.CodingSeries20to40Days;


import java.util.Scanner;

public class CricketScoreAnalyzer {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter the total runs scored: ");
        int runs = s.nextInt();

        System.out.print("Enter the number of wickets lost: ");
        int wickets = s.nextInt();

        if (wickets == 10) {
            System.out.println("All Out!");
        } else if (runs >= 250 && wickets <= 5) {
            System.out.println("Excellent Performance!");
        } else if (runs >= 200) {
            System.out.println("Good Score!");
        } else if (runs >= 150) {
            System.out.println("Average Score!");
        } else {
            System.out.println("Low Score!");
        }

        System.out.println("Final Score: " + runs + "/" + wickets);

        s.close();
    }
}

