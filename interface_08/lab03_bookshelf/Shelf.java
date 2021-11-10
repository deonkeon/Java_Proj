package interface_08.lab03_bookshelf;

import java.util.ArrayList;

public class Shelf {
	
	protected ArrayList <String> shelf;		// ArrayList 선언, shelf : 인스턴스 변수(객체형 변수)
	
	public Shelf () {	// 생성자 : 초기화
		shelf = new ArrayList<String>();	// ArrayList 생성 (new 사용)
	}
	public ArrayList<String> getShelf(){	// getter : shelf
		return shelf;
	}
	public int getCount() {
		return shelf.size();		// ArrayList 방의 갯수 : 책장에 남아 있는 책의 갯수
	}
	
}
