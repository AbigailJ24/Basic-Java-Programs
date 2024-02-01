package com.jprograms.java;

abstract class calculator
{
	abstract double calc();
}
class add extends calculator
{
	
	
	//@Override
	double calc()
	{
		double a = 7;
		double b = 9;
		return a+b;
	}
	
	
}
class mul extends calculator
{
	
	double calc()
	{
		double x = 7;
		double y = 9;
		return x*y;
	}
}
public class Abstract1 {

	public static void main(String[] args) {
	calculator c1 = new add();
	calculator c2 = new mul();
	double s1 = c1.calc();
	double s2 = c2.calc();
	System.out.println(s1);
	System.out.println(s2);
	}

}
