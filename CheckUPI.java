package com.dp;

import java.util.Scanner;

@SuppressWarnings("serial")
class UserDefiExcep extends Exception{
	
	UserDefiExcep(){
	}
}

public class CheckUPI {
	
	public void validate(int upi) throws UserDefiExcep{
		if(upi != 1234) {
			throw new UserDefiExcep();
		} else {
			System.out.println("Yeah!! you can go ahead...");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the UPI : ");
		int upi = sc.nextInt();
		
		CheckUPI c = new CheckUPI();
		
		try {
			c.validate(upi);
		} catch(UserDefiExcep e){
			System.out.println("Exception occurred");
		}
		
		sc.close();
	}
}