package com.codingseries41to60Days;
import java.util.Scanner;
public class PINValidationProgram {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("          PIN VALIDATION PROGRAM");
        System.out.println("==========================================");
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println();
        System.out.println("Hello " + name + "!");
        System.out.println("Please create a 4-digit PIN.");
        System.out.print("Enter your new PIN: ");
        String newPin = sc.next();
        if (!isValidPinLength(newPin)) {
            System.out.println();
            System.out.println("Invalid PIN!");
            System.out.println("PIN must contain exactly 4 digits.");
            sc.close();
            return;
        }
        if (!containsOnlyDigits(newPin)) {
            System.out.println();
            System.out.println("Invalid PIN!");
            System.out.println("PIN must contain only digits.");
            sc.close();
            return;
        }
        if (hasRepeatedDigits(newPin)) {
            System.out.println();
            System.out.println("Invalid PIN!");
            System.out.println("PIN should not contain repeated digits.");
            sc.close();
            return;
        }
        System.out.println();
        System.out.println("PIN created successfully!");
        System.out.println();
        System.out.println("==========================================");
        System.out.println("          PIN VERIFICATION");
        System.out.println("==========================================");
        int attempts = 0;
        int maxAttempts = 3;
        boolean verified = false;
        while (attempts < maxAttempts && !verified) {
            System.out.println();
            System.out.println("------------------------------------------");
            System.out.println("1. Enter PIN");
            System.out.println("2. Change PIN");
            System.out.println("3. Exit");
            System.out.println("------------------------------------------");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
            case 1:
                System.out.print("Enter your PIN: ");
                String enteredPin = sc.next();
                attempts++;
                if (enteredPin.equals(newPin)) {
                    verified = true;
                    System.out.println();
                    System.out.println("==========================================");
                    System.out.println("          PIN VERIFIED SUCCESSFULLY!");
                    System.out.println("==========================================");
                    System.out.println("Welcome, " + name + "!");
                    System.out.println("Verification Attempts: " + attempts);
                } else {
                    System.out.println();
                    System.out.println("Incorrect PIN!");
                    int remainingAttempts = maxAttempts - attempts;
                    if (remainingAttempts > 0) {
                        System.out.println("Remaining attempts: "
                                + remainingAttempts);
                    }
                }
                break;
            case 2:
                System.out.print("Enter your current PIN: ");
                String currentPin = sc.next();
                if (currentPin.equals(newPin)) {
                    System.out.print("Enter your new 4-digit PIN: ");
                    String changedPin = sc.next();
                    if (!isValidPinLength(changedPin)) {
                        System.out.println("Invalid PIN!");
                        System.out.println(
                                "PIN must contain exactly 4 digits.");
                    } else if (!containsOnlyDigits(changedPin)) {
                        System.out.println("Invalid PIN!");
                        System.out.println(
                                "PIN must contain only digits.");
                    } else if (hasRepeatedDigits(changedPin)) {
                        System.out.println("Invalid PIN!");
                        System.out.println(
                                "PIN should not contain repeated digits.");
                    } else {
                        newPin = changedPin;
                        System.out.println();
                        System.out.println(
                                "PIN changed successfully!");
                    }
                } else {
                    System.out.println();
                    System.out.println("Incorrect current PIN!");
                    System.out.println("PIN cannot be changed.");
                }
                break;
            case 3:
                System.out.println();
                System.out.println("PIN verification cancelled.");
                System.out.println("Thank you for using the system.");
                sc.close();
                return;
            default:
                System.out.println();
                System.out.println("Invalid choice!");
                System.out.println("Please select 1, 2, or 3.");
            }
        }
        if (!verified) {
        	System.out.println();
            System.out.println("==========================================");
            System.out.println("          PIN VERIFICATION FAILED");
            System.out.println("==========================================");
            System.out.println("Maximum verification attempts reached.");
            System.out.println("Please try again later.");
        }
        sc.close();
    }
    public static boolean isValidPinLength(String pin) {
        return pin.length() == 4;
    }
    public static boolean containsOnlyDigits(String pin) {
        for (int i = 0; i < pin.length(); i++) {
            if (!Character.isDigit(pin.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    public static boolean hasRepeatedDigits(String pin) {
        for (int i = 0; i < pin.length(); i++) {
            for (int j = i + 1; j < pin.length(); j++) {
                if (pin.charAt(i) == pin.charAt(j)) {
                    return true;
                }
            }
        }
        return false;
    }
}