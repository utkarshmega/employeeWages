package com.employeewages;

import java.util.Random;
public class employeewages {
	
	static int wph = 20;
	static int wh = 8;
	static int maxhour = 100;
	static int maxdays = 20;
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int days=0, workinghr=0, wages=0, totalwages=0;
		
		while(days<=maxdays && workinghr<=maxhour)
		{
			int att = rnd.nextInt(2);
			if(att==1)
			{
				days++;
				workinghr += wh;
				if(workinghr>maxhour || days>maxdays)
				{
					workinghr = maxhour;
					days = maxdays;
					break;
				}
			}
			else 
				days++;
			if(days>maxdays)
			{
				days=maxdays;
				break;
			}
		}
			
			
		System.out.println("Total days worked = "+days);
		System.out.println("Total working hours = "+workinghr);
		System.out.println("Total wage for the month is Rs."+ days*workinghr*20 +"/-");
				

	}
}
