package com.dp;

public class SwapNumber {

	public static void main(String args[]) {
		
		int num1 = 24;
		int num2 = 67;
		
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		
		System.out.println("After Swapping number 1 : " + num1);
		System.out.println("After Swapping number 2 : " + num2);
	}
}
