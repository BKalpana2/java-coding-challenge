package com.CodingSeries1to20Days;

import java.util.Scanner;

public class EmailValidationProgram {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        String email;

	        while (true) {
	            System.out.print("Enter your email: ");
	            email = sc.nextLine();
	           

	            if (email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
	                System.out.println("Valid Email Address");
	                break;
	            } else {
	                System.out.println("Invalid Email Address. Please try again.");
	            }
	            System.out.println();
	        }

	        sc.close();
	    }
	}