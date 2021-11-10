package generic_12.ex02;

import java.util.Vector;

public class PointVectorEx {

	public static void main(String[] args) {
		Vector <Point> v = new Vector<Point>();
		v.add(new Point (2,3));
		v.add(new Point (-5,20));
		v.add(new Point (30,-8));
		
		v.remove(1);	// index 1 번방의 객체를 삭제 (-5,20)
		
		// 백터의 모든 내용을 검색해서 출력
		for (int i=0; i<v.size(); i++) {
			Point p = v.get(i);
			System.out.println(p);
		}
		

	}

}
