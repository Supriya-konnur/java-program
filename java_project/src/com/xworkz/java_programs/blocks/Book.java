package com.xworkz.java_programs.blocks;

public class Book {
	{
		System.out.println("I am IIB of Book");
	}
	{
		System.out.println("I am IIB2 of Book");
	}
	static {
		System.out.println("I am SIB of Book");
	}
	{
		System.out.println("I am SIB2 of Book");
	}
	Book(){
		System.out.println("I am constructor of Book");
	}


}
