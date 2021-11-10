package inheritance_07.lab7;

public class Point {	// 부모 클래스
	private int x, y ;		//점의 좌표, x,y
	public Point () {
		this.x = this.y = 0;
	}
	public Point (int x, int y) {
		this.x = x ; this.y = y ;
	}

	public void showPoint () {
		System.out.println("(" + x + " , " + y + ")");
		
	}
	
}
