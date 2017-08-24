package com.javaex.ex08;

public class Rectangle extends Shape implements Drawable{	//상속,인터페이스
	
	private int width;
	private int height;
	
	public Rectangle() {
		
	}
	public Rectangle(String fillColor,String lineColor, int width, int height) {
		super( fillColor,lineColor);
		this.width=width;
		this.height=height;
	}
	public void draw() {
		System.out.println("사각형을 그렸습니다.[가로:"+width+"세로:"+height+"]");
	}
	public double area() {
		return width*height;
	}
}
