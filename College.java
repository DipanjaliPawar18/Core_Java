package com.info;

public class College {

	String collegeName;
	String dept;
	int id;
	
	College(){
		System.out.println("College's object is created");
	}
	
	public void collegeInfo(String dept, int id ) {
		System.out.println("Department is: " + dept + "\nID is : " + id);
	}
}