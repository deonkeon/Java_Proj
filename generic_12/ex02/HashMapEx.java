package generic_12.ex02;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx {	// 단어 검색창 (영문, 한글)을 해쉬맵에 저장하고 영어를 넣었을 때 한글을 출력

	public static void main(String[] args) {
		HashMap<String, String> dic = new HashMap<String, String>();
		Scanner sc = new Scanner(System.in);
		
		dic.put("baby", "아기");		// key / value, key는 인덱스, value가 값
		dic.put("love", "사랑");		// key 값을 입력하면 value를 출력하여 찾는 방식
		dic.put("apple", "사과");
		
		// 영어 단어를 넣으면 한글 단어를 검색, "exit"를 입력 받으면 종료.
		while(true) {
			System.out.println("찾고 싶은 단어는? ");
			String eng = sc.next();
			if(eng.equals("exit")) {
				System.out.println("프로그램을 종료합니다. ");
				break;
			}
		// HashMap에서 영문 값에 해당하는 한글을 검색
			String kor = dic.get(eng);		// 사전에서 영문을 검색해서 한글값을 저장
			if (kor == null) {
				System.out.println("검색 결과가 없습니다. ");
			} else {
				System.out.println(kor);
			}
			
		}
		sc.close();
	}

}
