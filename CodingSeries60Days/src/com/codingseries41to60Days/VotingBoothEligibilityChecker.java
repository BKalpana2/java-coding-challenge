package com.codingseries41to60Days;
import java.util.Scanner;
public class VotingBoothEligibilityChecker {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("\n----- VOTING BOOTH ELIGIBILITY CHECKER -----");
        System.out.println("\nVoter Name        : " + name);
        System.out.println("Voter Age         : " + age);
        System.out.println("Minimum Age       : 18 years");
        if (age >= 18) {
            System.out.println("Age Verification  : Passed");
            System.out.println("\nVoting Status     : Eligible to Vote");
            System.out.println("Booth Access      : Allowed");
            System.out.println("Message           : You are eligible to cast your vote.");
        } else {

            System.out.println("Age Verification  : Not Passed");
            System.out.println("\nVoting Status     : Not Eligible to Vote");
            System.out.println("Booth Access      : Not Allowed");
            System.out.println("Message           : You must be 18 or above to vote.");
        }

        System.out.println("\n---------------------------------------------");
        System.out.println("Thank you for participating in the voting process.");
        System.out.println("---------------------------------------------");

        sc.close();
    }
}
