package com.xworkz.java_programs.apti;
/* WAP to print numbers between 1-50
 * which are dividsible by 3,5,3&5
 */

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		for(i=1; i<=50; i++) {
			if(i%3 == 0 && i%5 == 0) 
				System.out.println("number divisible by 3&5:" +i);			
		
		else if(i%3 == 0) 
			System.out.println("number divisible by 3:" +i);	
		
		else if(i%5 == 0) 
			System.out.println("number divisible by 5:" +i);
	}
	

	}

}
