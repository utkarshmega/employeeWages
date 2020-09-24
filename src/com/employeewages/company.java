package com.employeewages;

import java.util.*;
public class company extends employeewages {
	
	company(int wph, int wh, int maxhour, int maxdays) {
		super(wph, wh, maxhour, maxdays);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the wages per hour");
		int wph = sc.nextInt();
		System.out.println("Enter the working hours per day");
		int wh = sc.nextInt();
		System.out.println("Enter the max working hour");
		int maxhour = sc.nextInt();
		System.out.println("Enter the max number of working days");
		int maxdays = sc.nextInt();
		
		employeewages e = new employeewages(wph, wh, maxhour, maxdays);
		e.computeWage();
		
		sc.close();
	}

}
