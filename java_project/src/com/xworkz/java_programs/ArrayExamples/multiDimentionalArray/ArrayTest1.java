package com.xworkz.java_programs.array.multiDimentionalArray;

public class ArrayTest1 {

	public static void main(String[] args) {
		int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		System.out.println("the elements of the rray is:");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
