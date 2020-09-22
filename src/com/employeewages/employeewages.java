package com.employeewages;

import java.util.Random;
public class employeewages {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int att = rnd.nextInt(3);
		int wph=20;
		int wh = 8;
		int htwh = 8;
		
		switch(att)
		{
			case 1: System.out.println("Total full time daily wages = Rs."+ (wph*wh) +"/-");
			break;
			case 2: System.out.println("Total part-time daily wage = Rs." + (wph*htwh)+"/-");
			break;
			default: 	System.out.println("Employee is absent"); 
				
		}
				

	}
}
