
package com.javaex.ex02;

public class GoodsApp {
	public static void main(String[] args) {
	
		Goods cup=new Goods("머그컵",2000);
		cup.showinfo();
		
		Goods cameae=new Goods("니콘",50000);
		cup.showinfo();
		
		
		/*Goods camera=new Goods();			//클래스에서 생략돼있던 생성자로인해 구동
		camera.setName("니콘");
		camera.setPrice(400000);
		
		Goods phone=new Goods();
		phone.setName("LG그램");
		phone.setPrice(900000);
		
		Goods cup=new Goods();
		cup.setName("머그컵");
		cup.setPrice(2000);
		
		camera.showinfo();
		System.out.println();
		phone.showinfo();
		System.out.println();
		cup.showinfo();*/
	}
	
}
