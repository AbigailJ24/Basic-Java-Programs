package com.jprograms.java;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		try {
			int A = 10/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		finally 
		{
			System.out.println("Completed");
		}
		/*
		 * int a = 10/0;
		 * System.out.println(a);
		 */

	}

}
