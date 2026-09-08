package com.CodingSeries21to40Days;
import java.util.Scanner;
public class HospitalBillCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== Hospital Bill Calculator =====");
        System.out.print("Enter room charges: ");
        double roomCharges = sc.nextDouble();
        System.out.print("Enter doctor consultation charges: ");
        double doctorCharges = sc.nextDouble();

        System.out.print("Enter medicine charges: ");
        double medicineCharges = sc.nextDouble();

        System.out.print("Enter laboratory charges: ");
        double laboratoryCharges = sc.nextDouble();

        System.out.print("Enter other charges: ");
        double otherCharges = sc.nextDouble();

        double totalBill = roomCharges + doctorCharges
                         + medicineCharges + laboratoryCharges
                         + otherCharges;

        System.out.println("\n===== Hospital Bill =====");
        System.out.println("Room Charges       : ₹" + roomCharges);
        System.out.println("Doctor Charges     : ₹" + doctorCharges);
        System.out.println("Medicine Charges   : ₹" + medicineCharges);
        System.out.println("Laboratory Charges : ₹" + laboratoryCharges);
        System.out.println("Other Charges      : ₹" + otherCharges);
        System.out.println("------------------------------");
        System.out.println("Total Hospital Bill: ₹" + totalBill);

        sc.close();
    }
}

