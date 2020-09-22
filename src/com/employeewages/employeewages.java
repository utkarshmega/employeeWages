package com.employeewages;

import java.util.Random;
public class employeewages {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		int wph = 20; //wages per hour
		int fwt = 8;  //full working hour
		int hwt = 4;  //half working day
		int rndatt;   //random attendance generator
		int wh=0, wages=0, totalwages = 0, workinghours=0, workingdays=0;
		for(int days = 1; days<=20; days++) {
			
			rndatt = rnd.nextInt(2);
			switch(rndatt)
			{
			
				case 1: // the employee is present on this day
				{
					workingdays++;
					wh = rnd.nextInt(2);  // to generate random working hour
					if(wh == 0) {  // 0 is full working hours
						wages = fwt * wph;
						workinghours += fwt;
					}
					else if (wh == 1) {  // 1 is half time
						wages = hwt * wph;
						workinghours += hwt;
					}
					System.out.println("On Day " +days+" wage = "+wages);
					break;
				}
				case 0:   // the employee is absent on this day
				{
					System.out.println("On Day " +days+" Absent");
					break;
				}
			}
			totalwages += wages;
			if(workinghours == 100)
			{
				System.out.println("Total working hours has reached 100");
				break;
			}
				
		}
		System.out.println("Total working hours = "+workinghours);
		System.out.println("Total working days = "+workingdays);
		System.out.println("Total wages for the month is Rs. " +totalwages);
		
	}

}
