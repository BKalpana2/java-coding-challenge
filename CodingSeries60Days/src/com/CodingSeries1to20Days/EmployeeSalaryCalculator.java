package com.CodingSeries1to20Days;
import java.util.Scanner;
public class EmployeeSalaryCalculator {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Employee ID : ");
		int id=s.nextInt();
		s.nextLine();
		System.out.println("Enter the Employee Name : ");
		String name=s.nextLine();
		System.out.println("Enter Basic Salary : ");
		double basicsalary=s.nextDouble();
		double hra=basicsalary*0.20;
		double da=basicsalary*0.10;
		double pf=basicsalary*0.12;
		double grosssalary=basicsalary+hra+da;
		double netsalary=grosssalary-pf;
		System.out.println("=====================");
		System.out.println("EMPLOYEE SALARY");
		System.out.println("=====================");
		System.out.println("Employee ID : "+id);
		System.out.println("Employee Name : "+name);
		System.out.println("Basic salary : "+"₹"+basicsalary);
		System.out.println("Hra : "+"₹"+hra);
		System.out.println("Da :"+"₹"+da);
		System.out.println("Pf : "+"₹"+pf);
		System.out.println("Gross Salary : "+"₹"+grosssalary);
		System.out.println("Net Salary : "+"₹"+netsalary);
		s.close();
	}

}
