package com.employeewages;

import java.util.*;
public class company extends employeewages implements employeeinterface {
	
	company(int wph, int wh, int maxhour, int maxdays) {
		super(wph, wh, maxhour, maxdays);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of companies");
		int co = sc.nextInt();
		String[] coName = new String[co];
		int[] noofemp = new int[co];
		int [] totalwages = new int[co];
		
		for(int i=0;i<co;i++)
		{
			System.out.println("Enter the company name");
			coName[i] = sc.next();
			sc.nextLine();
			System.out.println("Enter the number of employees in the company");
			noofemp[i] = sc.nextInt();
		}
		employeewages e = new employeewages(20, 8, 100, 20);
//		
//		System.out.println("Enter the wages per hour");
//		int wph = sc.nextInt();
//		System.out.println("Enter the working hours per day");
//		int wh = sc.nextInt();
//		System.out.println("Enter the max working hour");
//		int maxhour = sc.nextInt();
//		System.out.println("Enter the max number of working days");
//		int maxdays = sc.nextInt();
		for(int i=0;i<co;i++)
		{
			int temp = 0;
			for(int j=1;j<=noofemp[i];j++)
				temp += e.computeWage();
			
			totalwages[i] = temp;
				
		}
		for(int i=0;i<co;i++)
		{
			System.out.println("Company name = "+coName[i]);
			System.out.println("Total wages per month for the company is Rs."+totalwages[i]);
		}		
		
		sc.close();
	}

}
