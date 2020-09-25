package com.employeewages;

import java.util.Random;
public class employeewages {
	
	int wph = 0 ;
	int wh = 0;
	int maxhour = 0;
	int maxdays = 0;
	int noofco = 0;
	static int arr[];
	employeewages(int wph, int wh, int maxhour, int maxdays, int noofco)
	{
		this.wph = wph;
		this.wh = wh;
		this.maxhour = maxhour;
		this.maxdays = maxdays;
		this.noofco = noofco;
	}
	public int computeWage()
	{
		arr = new int[20];
		Random rnd = new Random();
		
		int days=0, workinghr=0;
		
		while(days<=maxdays && workinghr<=maxhour)
		{
			int att = rnd.nextInt(2);
			if(att==1)
			{
				days++;
				int tmp = wh * wph;
				if(days<21)
					arr[days-1] = arr[days-1] + tmp;
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
			if(days> maxdays)
			{
				days=maxdays;
				break;
			}
		} 
		return days*workinghr*wph;
			
//		System.out.println("Total days worked = "+days);
//		System.out.println("Total working hours = "+workinghr);
//		System.out.println("Total wage for the month is Rs."+  +"/-");
	}
	
}