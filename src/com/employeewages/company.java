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
		ArrayList<String> coName = new ArrayList<>(co);
		ArrayList<Integer> noofemp = new ArrayList<>(co);
		ArrayList<Integer> totalwages = new ArrayList<>(co);
		
		for(int i=0;i<co;i++)
		{
			System.out.println("Enter the company name");
			coName.add(sc.nextLine());
			sc.nextLine();
			System.out.println("Enter the number of employees in the company");
			noofemp.add(sc.nextInt());
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
			for(int j=1;j<=noofemp.get(i);j++)
				temp += e.computeWage();
			
			totalwages.add(temp);
				
		}
		for(int i=0;i<co;i++)
		{
			System.out.println("Company name = "+coName.get(i));
			System.out.println("Total wages per month for the company is Rs."+totalwages.get(i));
		}		
		
		sc.close();
	}

}
