package com.employeewages;

import java.util.Random;
public class employeewages {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int att = rnd.nextInt(2);
		
		if(att ==0)
			System.out.println("Employee absent");
		else 
			System.out.println("Employee present");
		

	}
}
