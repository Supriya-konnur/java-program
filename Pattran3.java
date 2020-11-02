package com.xworkz.java_programs.apti;

public class Pattran3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lines=7;
		for(int i=0; i<lines-1; i++) {
			for(int j=0; j<lines-1; j++) {
				if(i == 0 || i == 6 || i==j || j == 0 ||
						j == 6 || i+j == lines-1) {
					System.out.print("  *  ");
				}
				else {
					System.out.print("     ");
				}
			}
			System.out.println();
		}

}

	}
