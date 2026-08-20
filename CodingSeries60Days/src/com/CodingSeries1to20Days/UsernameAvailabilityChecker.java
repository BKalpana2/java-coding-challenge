package com.CodingSeries1to20Days;
import java.util.Scanner;
public class UsernameAvailabilityChecker {	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] usernames = {
            "kalpana",
            "admin",
            "john",
            "developer",
            "javauser"
        };
        while (true) {
            System.out.print("Enter username: ");
            String username = sc.nextLine();

            boolean available = true;

            for (String user : usernames) {
                if (user.equalsIgnoreCase(username)) {
                    available = false;
                    break;
                }
            }
            if (available) {
                System.out.println("Username is available ✅");
                break;
            } else {
                System.out.println("Username is already taken ❌");
                System.out.println("Please enter a new username.\n");
            }
        }
        sc.close();
    }
}