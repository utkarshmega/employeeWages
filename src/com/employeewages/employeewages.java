package com.employeewages;

import java.util.Random;
public class employeewages {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int att = rnd.nextInt(3);
		int wph=20;
		int wh = 8;
		
		if(att==1)
			System.out.println("Total full time daily wages = Rs."+ (wph*wh) +"/-");
		else if(att == 2)
			System.out.println("Total part-time daily wage = Rs." + (wph*wh)+"/-");
		else 
			System.out.println("Employee is absent");
		

	}
}
