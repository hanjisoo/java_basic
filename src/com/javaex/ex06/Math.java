package com.javaex.ex06;

public class Math {
	
	public static double PI = 3.14;

	public static int plus(int a, int b) {		//sttic이라 다올라가있어
return a + b;

	}

	public static double plus(double a, double b) {
return a + b;

	}

	public static double CircleArea(int radius) {
return radius * radius * PI;

	}
}
