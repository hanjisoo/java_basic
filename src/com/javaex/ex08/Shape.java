package com.javaex.ex08;

public abstract class Shape {
	private String fillColor;
	private String lineColor;
	
	public Shape() {
	}
	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
		
	}

	/*public void draw() {
		System.out.println("그릴 수 없습니다.");
	}*/
	/*public abstract void draw();*/		//부모용이니깐 상속해서 써.
	
	public abstract double area(); 
	
}
