package com.xworkz.java_programs.apti.apti_pgm1;
/*
  *       *        * 
    *     *     *    
       *  *  *       
 *  *  *  *  *  *  * 
       *  *  *       
    *     *     *    
 *        *        * 

 */

public class Assignment_pattarn4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lines=7;
		for(int i=0; i<7; i++) {
			for(int j=0; j<7; j++) {
				if(i == 3 || i == j || j == 3 || i+j == lines-1) {
					System.out.print(" * ");
				}
				else {
					System.out.print("   ");
				}
			}
			System.out.println();
			}

	}

}
