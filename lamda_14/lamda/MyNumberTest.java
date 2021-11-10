package lamda_14.lamda;

public class MyNumberTest {

	public static void main(String[] args) {
		
		// 삼항 연산자를 사용해서 Max 값을 출력
		
		MyNumber max =  (x,y) -> (x >= y) ? x:y;	// 람다식을 인터페이스 자료형 max 변수에 대입
		System.out.println(max.getMax(10, 20));		// 인터페이스 자료형 변수로 함수 호출

		// 삼항 연산자와 람다식을 이용해서 최소값 출력.
		
		MyNumber2 min = (x,y) -> (x<=y) ? x:y;
		System.out.println(min.getMin(10, 20));
		
	}

}
