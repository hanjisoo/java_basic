package com.javaex.ex10;

import java.io.IOException;

public class ThrowsApp {

	public static void main(String[] args) {
		ThrowsExc exep= new ThrowsExc();
		
		try {
			exep.excuteExcept();
		}catch(IOException e) {
			System.out.println("나만의 처리방식으로 처리");
		}
		

	}

}
