package com.CodingSeries1to20Days;
import java.util.Scanner;
public class AgeEligibilityChecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("======================================");
		System.out.println("       AGE ELIGIBILITY CHECKER");
		System.out.println("======================================");
		System.out.print("Enter your name: ");
		String name = sc.nextLine();
		System.out.print("Enter your age: ");
		int age = sc.nextInt();
		System.out.println("--------------------------------------");
		if (age < 0 || age > 120) {
			System.out.println("Invalid age entered.");
		} else {
			System.out.println("Name : " + name);
			System.out.println("Age  : " + age);
			// Child eligibility
			if (age < 13) {
				System.out.println("Category : Child");
				System.out.println("You are eligible for children's activities.");
			}
			// Teenager eligibility
			else if (age >= 13 && age < 18) {
				System.out.println("Category : Teenager");
				System.out.println("You are eligible for student activities.");
				System.out.println("You are not eligible for voting.");
				System.out.println("You are not eligible for a driving license.");
			}
			// Adult eligibility
			else if (age >= 18 && age < 60) {
				System.out.println("Category : Adult");
				// Voting eligibility
				if (age >= 18) {
					System.out.println("Voting Eligibility : Eligible");
				}
				// Driving license eligibility
				if (age >= 18) {
					System.out.println("Driving License    : Eligible");
				}
				// Senior citizen check
				System.out.println("Senior Citizen     : Not Eligible");
			}
			// Senior citizen eligibility
			else {
				System.out.println("Category : Senior Citizen");
				System.out.println("Voting Eligibility : Eligible");
				System.out.println("Driving License    : Depends on medical fitness");
				System.out.println("Senior Citizen     : Eligible");
			}
			System.out.println("--------------------------------------");
			// General age group
			if (age < 13) {
				System.out.println("Age Group : Child");
			} 
			else if (age < 18) {
				System.out.println("Age Group : Teenage");
			} 
			else if (age < 60) {
				System.out.println("Age Group : Adult");
			} 
			else {
				System.out.println("Age Group : Senior Citizen");
			}
			System.out.println("--------------------------------------");
			System.out.println("Eligibility check completed.");
		}
		System.out.println("======================================");
		System.out.println("          THANK YOU!");
		System.out.println("======================================");
		sc.close();
	}
}
