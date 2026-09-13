package com.codingseries41to60Days;

import java.util.Scanner;

public class SimpleChatLoginValidation45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correctUsername = "kalyan";
        String correctPassword = "java123";
        System.out.println("===== Simple Chat Login =====");
        System.out.print("Enter username: ");
        String username = sc.nextLine();
        System.out.print("Enter password: ");
        String password = sc.nextLine();
        System.out.println("\n===== Login Result =====");
        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Username Verification : Passed");
            System.out.println("Password Verification : Passed");
            System.out.println("Login Status          : Successful");
            System.out.println("Welcome to the chat!");
        } else if (!username.equals(correctUsername)) {
            System.out.println("Username Verification : Failed");
            System.out.println("Login Status          : Failed");
            System.out.println("Reason                : Invalid username.");
        } else {
            System.out.println("Username Verification : Passed");
            System.out.println("Password Verification : Failed");
            System.out.println("Login Status          : Failed");
            System.out.println("Reason                : Invalid password.");
        }
        System.out.println("--------------------------------------");
        System.out.println("Chat login validation completed.");
        System.out.println("--------------------------------------");
        sc.close();
    }
}
