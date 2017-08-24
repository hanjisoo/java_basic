package com.javaex.ex05;

public class Tv {
	private int channel;
	private int volume;
	private boolean power;
	
	public void power(boolean power) {
		if(power==true) {
			this.power=true;
		}else {
			this.power=false;
		}
		/*this.power=power;*/
	}
	
	
	public void volume(int volume) {
		if(0<=volume && volume<=100) {
			this.volume=volume;
		
		}
			
		
	}
	public void volume(boolean up) {
	
		if(up==true) {
			
			this.volume=volume+1;
		}else {
			this.volume=--volume;
		}
	}
	
	
	public void channel(int channel) {
		if(0<=channel && channel<=255) {
			this.channel=channel;
		}
		}
	public void channel(boolean up) {
		if(up==true) {
			this.channel=++channel;
		}else {
			this.channel=--channel;
		}
	}
	
	public Tv() {
		this.channel=7;
		this.volume=20;
		this.power=false;
			}						//클래스에서 Tv romote=new Tv(); 사용할때 쓰임
	
	
	public Tv(int channel,int volume,boolean power) {
		
		this.channel=channel;
		this.volume=volume;
		this.power=power;
	}
	public void status() {
		System.out.print("채널:"+channel+" "+"볼륨:"+volume+" ");
		System.out.println("파워:"+power);
	}
	
	
}

