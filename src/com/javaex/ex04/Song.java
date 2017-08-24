package com.javaex.ex04;

public class Song {
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private String track;
	
	public Song() {
	}
	public Song(String title,String artist,String album,String composer,int year,String track) {
		this.title=title;
		this.artist=artist;
		this.album=album;
		this.composer=composer;
		this.year=year;
		this.track=track;
	}
	public void showinfo() {
		System.out.println(title+","+artist+"("+album+","+","+year+","+track+","+composer+")");
	}
	
	
	/*public Song() {
	}
	
	public void setTitle(String title) {
		this.title=title;
	}
	public void setArtist(String artist) {
		this.artist=artist;
	}
	public void setAlbum(String album) {
		this.album=album;
	}
	public void setComposer(String composer) {
		this.composer=composer;
	}
	public void setYear(int year) {
		this.year=year;
	}
	public void setTrack(String track) {
		this.track=track;
	}
	public void showinfo() {
		System.out.println(title+","+artist+"("+album+","+","+year+","+track+","+composer+")");
	}*/
}
