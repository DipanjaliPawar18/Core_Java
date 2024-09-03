package com.dp;

public class WithoutLoop {
	
	public static void printNum(int n) {
		if(n > 100) {
			return;
		}
		System.out.println(n);
		printNum(n+1);
	}
	public static void main(String args[]) {
		printNum(1);
	}
}
