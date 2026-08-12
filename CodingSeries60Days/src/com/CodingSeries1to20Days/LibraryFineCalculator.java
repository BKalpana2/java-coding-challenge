package com.CodingSeries1to20Days;
import java.util.Scanner;
public class LibraryFineCalculator {

	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("====================================");
        System.out.println("       LIBRARY FINE CALCULATOR");
        System.out.println("====================================");
        System.out.print("Enter due date (day): ");
        int dueDate = s.nextInt();
        System.out.print("Enter return date (day): ");
        int returnDate = s.nextInt();
        if (returnDate <= dueDate) {
            System.out.println("Book returned on time.");
            System.out.println("Fine : ₹0");
        } 
        else {
            int lateDays = returnDate - dueDate;
            double fine;
            if (lateDays <= 5) {
                fine = lateDays * 2;
            } 
            else if (lateDays <= 10) {
                fine = lateDays * 5;
            } 
            else {
                fine = lateDays * 10;
            }
            System.out.println("Late Days : " + lateDays);
            System.out.println("Fine      : ₹" + fine);
        }
        System.out.println("====================================");
        s.close();
    }
}