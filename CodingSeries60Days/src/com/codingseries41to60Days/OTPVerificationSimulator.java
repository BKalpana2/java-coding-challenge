package com.codingseries41to60Days;
import java.util.Random;
import java.util.Scanner;
public class OTPVerificationSimulator {
	static Scanner sc = new Scanner(System.in);
	static Random random = new Random();
	public static void main(String[] args) {
		System.out.println("==========================================");
		System.out.println("        OTP VERIFICATION SIMULATOR");
		System.out.println("==========================================");
		System.out.print("Enter your name: ");
		String name = sc.nextLine();
		System.out.print("Enter your mobile number: ");
		String mobileNumber = sc.nextLine();
		if (mobileNumber.length() != 10) {
			System.out.println("Invalid mobile number!");
			System.out.println("Mobile number must contain 10 digits.");
			sc.close();
			return;
		}
		System.out.println();
		System.out.println("Hello " + name + "!");
		System.out.println("OTP will be sent to: ******"
				+ mobileNumber.substring(6));
		String otp = generateOTP();
		System.out.println();
		System.out.println("Your OTP is: " + otp);
		System.out.println("(OTP displayed only for simulation)");
		int attempts = 0;
		int maxAttempts = 3;
		boolean verified = false;
		while (attempts < maxAttempts && !verified) {
			System.out.println();
			System.out.println("------------------------------------------");
			System.out.println("1. Enter OTP");
			System.out.println("2. Resend OTP");
			System.out.println("3. Exit");
			System.out.println("------------------------------------------");
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.print("Enter the OTP: ");
				String enteredOtp = sc.next();
				attempts++;
				if (enteredOtp.equals(otp)) {
					verified = true;
					System.out.println();
					System.out.println("==========================================");
					System.out.println("       OTP VERIFIED SUCCESSFULLY!");
					System.out.println("==========================================");
					System.out.println("Welcome, " + name + "!");
					System.out.println("Mobile Number: ******"
							+ mobileNumber.substring(6));
					System.out.println("Verification Attempts: " + attempts);
				} else {
					System.out.println();
					System.out.println("Incorrect OTP!");
					int remainingAttempts = maxAttempts - attempts;
					if (remainingAttempts > 0) {
						System.out.println("Remaining attempts: "
								+ remainingAttempts);
					}
				}
				break;
			case 2:
				otp = generateOTP();
				System.out.println();
				System.out.println("==========================================");
				System.out.println("          NEW OTP GENERATED");
				System.out.println("==========================================");
				System.out.println("Your new OTP is: " + otp);
				System.out.println("(OTP displayed only for simulation)");
				break;
			case 3:
				System.out.println();
				System.out.println("Verification cancelled.");
				System.out.println("Thank you for using the system.");
				sc.close();
				return;
			default:
				System.out.println("Invalid choice!");
				System.out.println("Please select 1, 2, or 3.");
			}
		}
		if (!verified) {
			System.out.println();
			System.out.println("==========================================");
			System.out.println("       OTP VERIFICATION FAILED");
			System.out.println("==========================================");
			System.out.println("Maximum verification attempts reached.");
			System.out.println("Please try again later.");
		}
		sc.close();
	}
	public static String generateOTP() {
		int number = 100000 + random.nextInt(900000);
		return String.valueOf(number);
	}
}