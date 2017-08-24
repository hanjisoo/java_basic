package com.javaex.ex04;

public class SongApp {

	public static void main(String[] args) {
	
		Song iuMusic=new Song("좋은날","아이유","Real","이민수 작곡",2010,"3번 track");
		iuMusic.showinfo();
				
		Song bigBang=new Song("BIGBANG","거짓말","Always","G-DRAGON",2007,"2번 track");
		bigBang.showinfo();
		
		Song busKer=new Song("버스커버스커","벚꽃엔딩","버스커버스커1집","장범준 작곡",2012,"4번 track");
		busKer.showinfo();
		
		
		/*Song iuMusic=new Song();
		iuMusic.setTitle("좋은날");
		iuMusic.setArtist("아이유");
		iuMusic.setAlbum("Real");
		iuMusic.setYear(2010);
		iuMusic.setTrack("3번 track");
		iuMusic.setComposer("이민수 작곡");
		
		Song bigBang=new Song();
		bigBang.setTitle("BIGBANG");
		bigBang.setArtist("거짓말");
		bigBang.setAlbum("Always");
		bigBang.setYear(2007);
		bigBang.setTrack("2번 track");
		bigBang.setComposer("G-DRAGON 작곡");
		
		Song busKer=new Song();
		busKer.setTitle("버스커버스커");
		busKer.setArtist("벚꽃엔딩");
		busKer.setAlbum("버스커버스커1집");
		busker.setyear(2012);
		busKer.setTrack("4번 track");
		busker.setComposer("장범준 작곡");
		
		iuMusic.showinfo();
		bigBang.showinfo();
		busKer.showinfo();
		*/
		

	}

}
