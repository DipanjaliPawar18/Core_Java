package com.dp;

 	class RBI {
	
	RBI(){
		System.out.println("Object of RBI is created...!");
	}
	public void rateOfInterest() {
		System.out.println("Our rate of interest is 4.6 %");
	}
}

 	class SBI extends RBI {
	
	SBI(){
		System.out.println("Object of SBI is created...!");
	}

	public void sbiInfo() {
		System.out.println("we are agreed to all rules relased by RBI");
	}
}
	
 	class Swiss extends RBI  {
		
	Swiss(){
			System.out.println("Object of Swiss is created...!");
	}

	public void swissInfo() {
		System.out.println("MOU is signed with RBI now we are ready to do business in india");
	}
}

public class Bank {
	
	public static void main(String args[]) {

		SBI s = new SBI();
		s.sbiInfo();
		s.rateOfInterest();
		
		Swiss sw = new Swiss();
		sw.rateOfInterest();
		sw.swissInfo();	
	}
}
