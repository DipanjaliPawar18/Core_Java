package com.dp;
import java.util.Scanner;

public class ArraysNew {
	 public static void main(String args[]){
	       
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter number size of the array:");
	        int n = sc.nextInt();
	        int arr[] = new int[n];

	        System.out.println("Enter number elements of the array:");
	        for(int i = 0; i < n; i++){
	        	arr[i] = sc.nextInt();
	        }
	        
	        System.out.println("The array:");
	        for(int i = 0; i < n; i++){
	            System.out.println( arr[i] );
	        }
	        
	        System.out.println("Enter number to be found in the array:");
	        int k  = sc.nextInt();

	        for(int i = 0; i < n; i++){
	            if(arr[i] == k){
	            System.out.println("The desired number found at index : " + i);
	          }
	        }

	        sc.close();
	    }
}