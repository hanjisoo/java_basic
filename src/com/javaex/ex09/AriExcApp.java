package com.javaex.ex09;	//예외처리

import java.util.Scanner;

public class AriExcApp {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int result=0;
		int num=sc.nextInt();
		
		
		try {
			result=100/num;
		}catch(ArithmeticException e) {	//0으로 나누면 e를 찍어봐
			System.out.println(e);
		}finally {
			System.out.println("finally영역");
		}
				
		System.out.println(result);
		
		sc.close();

	}

}
