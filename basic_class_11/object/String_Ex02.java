package basic_class_11.object;

public class String_Ex02 {	// concat() : 두 문자열을 연결하여 출력, garbage 발생
							// 작은 양의 문자열을 연결할 때 사용.
							// 별도의 메모리 영역을 새로 생성 연결
	public static void main(String[] args) {
		String javaStr = new String("Java");
		String androidStr = new String("android");
		
		System.out.println(javaStr);
		System.out.println("처음 문자열 주소 값 : " + System.identityHashCode(javaStr));
						// 가비지 발생 : 메모리의 쓰레기 영역 
		
		javaStr = javaStr.concat(androidStr);	// concat() : 두개의 문자열을 연결하여 출력.
												// javaStr을 새로 정의했기 때문에 기존은 가비지로 잔존
		System.out.println(javaStr);
		System.out.println("연결된 문자열 주소값 : " + System.identityHashCode(javaStr));
		
		
		
	}

}
