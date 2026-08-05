package com.CodingSeries1to20Days;
import java.util.Scanner;
public class SmartCalculator {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int choice=0;
		do {
			System.out.println("==========Smart Calculator==========");
			System.out.println("1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			System.out.println("5.Modulus");
			System.out.println("6.Power");
			System.out.println("7.SquareRoot");
			System.out.println("8.Exit");
			System.out.println("Enter your choice : ");
			choice=s.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the number1 : ");
				int number1=s.nextInt();
				System.out.println("Enter the number2 : ");
				int number2=s.nextInt();
				System.out.println("Addition : "+(number1+number2));
				break;	
			case 2:
				System.out.println("Enter the number1 : ");
				number1=s.nextInt();
				System.out.println("Enter the number2 : ");
				number2=s.nextInt();
				System.out.println("Subtraction : "+(number1-number2));
				break;
			case 3:
				System.out.println("Enter the number1 : ");
				number1=s.nextInt();
				System.out.println("Enter the number2 : ");
				number2=s.nextInt();
				System.out.println("Multipilcation : "+(number1*number2));
				break;
			case 4:
				System.out.println("Enter the number1 : ");
				number1=s.nextInt();
				System.out.println("Enter the number2 : ");
				number2=s.nextInt();
				if(number2!=0) {
					System.out.println("Division : "+(number1/number2));
				}else {
					System.out.println("Cannot divide by zero");
				}
				break;
			case 5:
				System.out.println("Enter the number1 : ");
				number1=s.nextInt();
				System.out.println("Enter the number2 : ");
				number2=s.nextInt();
				if(number2!=0) {
					System.out.println("Modulus Division : "+(number1%number2));
				}else {
					System.out.println("Cannot divide by zero");
				}
				break;
			case 6:
				System.out.println("Enter the Base : ");
				number1=s.nextInt();
				System.out.println("Enter the Exponent: ");
				number2=s.nextInt();
				System.out.println("Power : "+ Math.pow(number1,number2));
				break;
			case 7:
				System.out.println("Enter the number :");
				double number=s.nextDouble();
				System.out.println("Square Root : "+ Math.sqrt(number));
				break;
			case 8:
				System.out.println("Thank you for using our smart Calculator");
				break;
			default:
				System.out.println("Invalid choice please choose among 1-8");

			}
		}while(choice!=8);
		s.close();

	}

}
