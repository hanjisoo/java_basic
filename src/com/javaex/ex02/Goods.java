package com.javaex.ex02;

public class Goods {
	private String name;
	private int price;
	private static int count;	//취급하는 상품개수 new 할때 하나씩 올라가게
								//틀에서 static이라고 되어있는애들을 모아
	public Goods() {
		}
	
	public Goods(String name) {
		this.name=name;
	}
	
	public Goods(String name, int price) {
		/*this.name=name;*/
		this(name);			//위에 소스랑 중복되니깐 위에 꺼 슬쩍 이용하겠다.
		this.price=price;
		count=count+1;			//상품수올려줄 소스
	}
	
	
	
	public void showinfo() {
		System.out.println(name+","+price+" "+count);
	}
	
	
	
	/*public void setName(String name) {	//메모리에 이름넣어줄수있게
		this. name=name;
	}
	
	public String getName() {		//안써줘도 되지
		return name;
	}
	
	public void setPrice(int price) {
		this.price=price;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void showinfo() {
		System.out.println("상품이름:"+name);//메모리올린다음 구동
		System.out.println("가격:"+price);
		
	}
	public void showinfo(boolean boo){
	if(boo){
	sysout
	
	*/
	
}
