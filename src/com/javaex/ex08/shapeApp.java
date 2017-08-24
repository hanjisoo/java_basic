package com.javaex.ex08;

public class shapeApp {

	public static void main(String[] args) {

		Drawable[] dArr = new Drawable[8];//2칸짜리

		Drawable r01 = new Rectangle("빨강", "빨강", 4, 4);
		Drawable r02 = new Rectangle("노랑", "노랑", 10, 10);
		Drawable c01 = new Circle("빨강","검정",5);
		Drawable c02 = new Circle("노랑","검정",7);
		Drawable t01 = new Triangle("빨강","검정", 3, 3);
		Drawable t02 = new Triangle("노랑","검정", 5, 5);
		Drawable p01 = new Point(1,1);
		Drawable p02 = new Point(10,10);
		
		dArr[0]=r01;
		dArr[1]=r02;
		dArr[2]=c01;
		dArr[3]=c02;
		dArr[4]=t01;
		dArr[5]=t02;
		dArr[6]=p01;
		dArr[7]=p02;
		
		for(int i=0; i<dArr.length; i++) {
			dArr[i].draw();
			
		}
		for(int i=0; i<dArr.length; i++) {
			/*dArr[i].area();*/
			shapeArea(dArr[i]);
		}
	}
	
	public static void shapeArea(Drawable d) {
		if(d instanceof Shape) {
			System.out.println("도형의 넓이는"+((Shape)d).area()+"입니다.");
		}
		
	
	
	}
	
		
		/*Shape[] sArr = new Shape[6];//2칸짜리

		Shape r01 = new Rectangle("빨강", "빨강", 4, 4);
		Shape r02 = new Rectangle("노랑", "노랑", 10, 10);
		Shape c01 = new Circle("빨강","검정",5);
		Shape c02 = new Circle("노랑","검정",7);
		Shape t01 = new Triangle("빨강","검정", 3, 3);
		Shape t02 = new Triangle("노랑","검정", 5, 5);
		
		//Shape s=new Shape();	abstract써서 사용불가.
		
		sArr[0]=r01;
		sArr[1]=r02;
		sArr[2]=c01;
		sArr[3]=c02;
		sArr[4]=t01;
		sArr[5]=t02;
		
		for(int i=0; i<sArr.length; i++) {
			sArr[i].draw();
		}
		for(int i=0; i<sArr.length; i++) {
			sArr[i].area();
			shapeArea(sArr[i]);
		}
	}

	public static void shapeArea(Shape s) {
		double area=s.area();
		System.out.println("도형의 넓이는"+area+"입니다.");
	}*/
}
