package com.dp;

public class Percentage {
	
	public static void main(String[] args) {
		
		float sub1 = 99;
		float sub2 = 98;
		float sub3 = 95;
		float sub4 = 98;
		float sub5 = 88;
		float sub6 = 93;
		
		float percent = (sub1 + sub2 + sub3 + sub4 + sub5 + sub6) * 100 / 600;
		
		System.out.println("The percentages of all the subjects is: " + percent);
	}
}
