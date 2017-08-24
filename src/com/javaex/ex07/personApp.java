package com.javaex.ex07;

public class personApp {
	public static void main(String[] args) {

		Student s1 = new Student("정우성", 45, "서울");

		s1.showInfo();// person과 student에 둘다 showinfo가 있을때 student꺼 사용

		Person ps=new Student("이효리", 40, "제주");
		ps.showInfo();
		
		((Student)ps).getSchool();		//강제변환이용해서 자식꺼 쓸수 있음.
		/*
		 Person p1 = new Person("한지수", 24); System.out.println(p1);
		 
		 Student s1 = new Student("서울"); System.out.println(s1);
		 */

	}
}
