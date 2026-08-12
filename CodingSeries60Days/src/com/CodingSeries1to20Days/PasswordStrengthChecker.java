package com.CodingSeries1to20Days;
import java.util.Scanner;

public class PasswordStrengthChecker {
	
    public static void main(String[] args) {
    	
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.print("Enter password: ");
            String password = s.nextLine();
            boolean upper = false, lower = false, digit = false, special = false;
            for (char ch : password.toCharArray()) {
                if (Character.isUpperCase(ch))
                    upper = true;
                else if (Character.isLowerCase(ch))
                    lower = true;
                else if (Character.isDigit(ch))
                    digit = true;
                else
                    special = true;
            }
            if (password.length() >= 8 && upper && lower && digit && special) {
                System.out.println("Password Strength: Strong");
                System.out.println("Password accepted!");
                break;
            } else {
                System.out.println("Password Strength: Weak");
                System.out.println("Please enter a stronger password.\n");
            }
        }
        
        s.close();
    }
}