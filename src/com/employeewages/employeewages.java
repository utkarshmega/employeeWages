package com.employeewages;

import java.util.Random;
public class employeewages {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int wph=20;
		int wh = 8;
		int days=0, wages=0, totalwages=0;
		for(int i=1;i<=20;i++)
		{
			int att = rnd.nextInt(2);
			if(att == 1)
			{
				days++;
				wages = wph * wh;
			}
			else {
				wages = 0;
			}
			totalwages += wages ;
			
		}
		System.out.println("Total days worked = "+days);
		System.out.println("Total wage for the month is Rs."+totalwages+"/-");
				

	}
}
