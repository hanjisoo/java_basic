package com.javaex.ex01;

public class GoodsApp {

	public static void main(String[] args) {   //goods시나리오
		
		Goods camera=new Goods();
		camera.setName("니콘");
		
		String n=camera.getName();
		System.out.println(n);
		
			
		
		/*
		Goods camera=new Goods();   //메모리에 탕!String name이랑int price올라온건임
		camera.name="니콘";
		camera.price=400000;
		
		System.out.println(camera.name);  //별명.
		System.out.println(camera.price);
		
		Goods cup=camera;//카메라에 있는 주소값넣어
		
				
		Goods cup=new Goods();
		cup.name="텀블러";
		cup.price=20000;
		
		System.out.println(cup.name);
		System.out.println(cup.price);
		
		
		Goods coffee=new Goods();
		coffee.name="아초";
		coffee.price=5000;
		
		System.out.println(coffee.name);
		System.out.println(coffee.price);
		
		Goods phone=new Goods();
		phone.name="애플";
		phone.price=1000000;
		
		System.out.println(phone.name);
		System.out.println(phone.price);*/
	}

}
