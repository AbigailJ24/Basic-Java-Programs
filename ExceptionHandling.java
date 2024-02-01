package com.jprograms.java;

import java.io.IOException;

public class ExceptionHandling {

	
		static void valid(int age) throws IOException
		{
			if(age<18)
			throw new ArithmeticException("Invalid");
			
			else
			{
				System.out.println("Valid");
             
			}
		}
		public static void main(String[] args) throws IOException
		{
		   ExceptionHandling te = new ExceptionHandling();
		    te.valid(1);
		System.out.println("ok");

	}

}
