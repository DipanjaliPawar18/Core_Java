package com.dp;
import java.util.Scanner;

public class Pallindrome {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your string :");
		String str = sc.nextLine();
		int n = str.length();
		String revrs = "";
		
		for(int i = n-1; i >= 0; i--) {
			revrs = revrs + str.charAt(i);	
		}
		
		if(str.equals(revrs)) {
			System.out.println("It's a palindrome...!");
		} else {
			System.out.println("Not a palindrome...!");
		}
		
		sc.close();
	}	
}