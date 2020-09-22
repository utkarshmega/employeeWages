package com.employeewages;

import java.util.Random;
public class employeewages {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int att = rnd.nextInt(2);
		int wph=20;
		int wh = 8;
		if(att ==0)
			System.out.println("Employee absent");
		else 
			System.out.println("Employee present");
		
		if(att==1)
			System.out.println("Total daily wages = Rs."+ (wph*wh) +"/-");
		else
			System.out.println("Employee is absent");
		

	}
}
