package com.CodingSeries1to20Days;

import java.util.Scanner;

public class CurrencyNoteDenominationCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the amount: ₹ ");
        int amount = sc.nextInt();

        int[] denominations = {2000, 500, 200, 100, 50, 20, 10};

        System.out.println("Currency Note Breakdown:");

        for (int note : denominations) {
            int count = amount / note;

            if (count > 0) {
                System.out.println("₹" + note + " : " + count + " note(s)");
                amount = amount % note;
            }
        }

        if (amount > 0) {
            System.out.println("Remaining amount: ₹" + amount);
        }

        sc.close();
    }
}
