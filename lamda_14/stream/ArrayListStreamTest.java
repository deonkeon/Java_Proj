package lamda_14.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {

	public static void main(String[] args) {	// 컬렉션의 스트림 사용
		
		List <String> sList = new ArrayList<String>();		// List type upcasting
		
		sList.add("Tomas");
		sList.add("Edward");
		sList.add("Jack");
		
		System.out.println("스트림을 사용하지 않고 출력");
		for (int i=0; i<sList.size(); i++) {
			String s = sList.get(i);
			System.out.println(s);
		}
		
		
		System.out.println("스트림을 사용해서 출력");
		Stream <String> stream = sList.stream();	// 컬렉션의 스트림 인스턴스 생성
		//첫번째 스트림
		stream.forEach(s -> System.out.print(s + " "));
		System.out.println();
		
		//두번째 스트림
		System.out.println("정렬해서 출력");
		sList.stream().sorted().forEach(s -> System.out.print(s + " "));
		System.out.println();
		
		//세번째 스트림
		System.out.println("글자수 출력 : map (모든 값에 적용)");
		sList.stream().map(s -> s.length()).forEach(n -> System.out.print(n + " "));
		System.out.println();
		// stream 생성 . 중간연산 . 최종연산
		
		//네번째 스트림
		System.out.println("글자가 5자 이상인 이름을 출력 : 필터 (조건을 사용해서 걸러 내는것)");
		sList.stream().filter(s -> s.length() >= 5).forEach(s -> System.out.println(s));
		
		System.out.println("ABCDEF 의 바이트수는 : a.length()");
		String a = "ABCDEF";
		System.out.println(a.length());		// 글자의 byte 수를 리턴
		
		
	}

}
