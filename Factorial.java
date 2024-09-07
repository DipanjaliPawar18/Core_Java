package com.dp;
import java.util.Scanner;

public class Factorial {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int fact = 0;
		
		if(num == 0) {
			fact = 1;
		}
		else if(num > 0) {
			fact = 1;
			for(int i = 1; i <= num; i++) {
				fact *= i;	
			}
		}
		else {
			System.out.println("Invalid input....!Please enter a positive number!!!");
		}
	
		System.out.println("Factorial of the number is : " + fact);
		
		sc.close();
	}
}