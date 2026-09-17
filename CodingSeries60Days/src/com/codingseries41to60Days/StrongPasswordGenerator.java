package com.codingseries41to60Days;
import java.util.Random;
import java.util.Scanner;
public class StrongPasswordGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String special = "@#$%&*!";
        String allCharacters = uppercase + lowercase + numbers + special;
        System.out.println("===== Strong Password Generator =====");
        System.out.print("Enter password length: ");
        int length = sc.nextInt();
        if (length < 8) {
            System.out.println("\nPassword length must be at least 8 characters.");
        } else {
            StringBuilder password = new StringBuilder();
            // Ensure at least one character from each category
            password.append(
                    uppercase.charAt(random.nextInt(uppercase.length())));
            password.append(
                    lowercase.charAt(random.nextInt(lowercase.length())));
            password.append(
                    numbers.charAt(random.nextInt(numbers.length())));
            password.append(
                    special.charAt(random.nextInt(special.length())));
            // Generate remaining characters
            for (int i = password.length(); i < length; i++) {
                password.append(
                        allCharacters.charAt(
                                random.nextInt(allCharacters.length())));
            }
            // Shuffle the generated password
            StringBuilder shuffledPassword = new StringBuilder();
            while (password.length() > 0) {
                int index = random.nextInt(password.length());
                shuffledPassword.append(password.charAt(index));
                password.deleteCharAt(index);
            }
            System.out.println("\n----- Password Generation Result -----");
            System.out.println("Password Length : " + length);
            System.out.println("Generated Password : " + shuffledPassword);
            System.out.println("Password Status : Strong");
            System.out.println("Contains Uppercase : Yes");
            System.out.println("Contains Lowercase : Yes");
            System.out.println("Contains Number : Yes");
            System.out.println("Contains Special Character : Yes");
        }
        System.out.println("\n--------------------------------------");
        System.out.println("Strong password generation completed.");
        System.out.println("--------------------------------------");
        sc.close();
    }
}