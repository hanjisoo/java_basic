package com.javaex.ex05;

public class TvApp {

	public static void main(String[] args) {
		Tv romote=new Tv(7,20,false);
		romote.status();
				
		romote.power(true);
		romote.volume(90);
		romote.status();
		
		romote.volume(false);
		romote.status();
		
		romote.channel(300);
		romote.status();
		
		romote.channel(true);
		romote.channel(true);
		romote.channel(true);
		romote.status();
		
		romote.power(false);
		romote.status();
	}

}
