package com.jprograms.java;

import java.util.Scanner;

public class Areaofpolygon {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("No. of sides in a polygon: ");
		int n = sc.nextInt();
		System.out.println("Length of a side in a polygon: ");
		double s = sc.nextDouble();
		double angle= Math.toRadians(180/n); 
		angle=Math.tan(angle);
		double area=((s*s*n)/(4*angle));
		System.out.print("Area of polygon is:"+area);
	}

}
