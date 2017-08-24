package com.javaex.ex07;

public class Person {

	private String name;		//protected 상속받은거 내에서 허용하겠다.
	private int age;

	public Person() {		//그림에서  원만듦
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void setNmae(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setage(int age) {
		this.age = age;
	}

	public int getage() {
		return age;
	}

	public void showInfo() {
		System.out.println("name:" + name + "age:" + age);
	}	//예쁘게 보일려고
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}	//개발자들이 코드다들어갔나 확인
}
