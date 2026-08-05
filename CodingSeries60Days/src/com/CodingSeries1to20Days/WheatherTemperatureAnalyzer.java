package com.CodingSeries1to20Days;
import java.util.Scanner;

public class WheatherTemperatureAnalyzer {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the temperature : ");
		int temperature=s.nextInt();
		if(temperature<0) {
			System.out.println("Wheather Condition : Freezing");
		}
		else if(temperature>0 && temperature <=15) {
			System.out.println("Wheather Condition : Cold");
		}
		else if(temperature>=16&&temperature<=25) {
			System.out.println("Wheather Condition : Pleasant");
		}
		else if(temperature>=26&&temperature<=35) {
			System.out.println("Wheather Condition : Warm");
		}
		else {
			System.out.println("Wheather Condition : Hot");
		}
		s.close();

	}

}
