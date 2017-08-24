package com.javaex.ex10;

import java.io.IOException;
public class ThrowsExc {
	public void excuteExcept() throws IOException{	//IOException를 던져버리겠다.
		System.out.println("강제예외발생");

		
		throw new IOException();
		/*try {
			throw new IOException();// 파일 읽는건데 파일이 없는 상황
		} catch (IOException e) {
			System.out.println("IOException 발생");
			System.out.println("파일만들어");
		}*/

	}
}
