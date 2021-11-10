package generic_12.ex01;

public class GenericMethod {
	
	// 제너릭 메소드, 두 개의 좌표값을 받아서 넓이를 계산
	
	public static <T,V> double makeRectangle (Point<T,V> p1, Point <T,V> p2) {
		double left =  ((Number) p1.getX()).doubleValue();
		double right = ((Number)p2.getX()).doubleValue();
		double top = ((Number)p1.getY()).doubleValue();
		double bottom = ((Number)p2.getY()).doubleValue();
		
		double width = right - left;
		double height = bottom - top;
		
		return width * height;		// 가로 * 세로 = 넓이
	}
	
	
	public static void main(String[] args) {

		Point<Integer,Double> p1 = new Point<Integer,Double>(0, 0.0);
		Point<Integer,Double> p2 = new Point<Integer,Double>(10, 10.0);
		
		double rect = GenericMethod.makeRectangle(p1,p2);
		System.out.println("두 점으로 만들어진 사격형의 넓이는 : " + rect + "입니다. ");
		
		
		
		
	}

}
