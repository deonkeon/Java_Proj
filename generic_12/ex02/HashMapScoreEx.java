package generic_12.ex02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapScoreEx {	// 해쉬맵을 이용해서 학생이름과 자바 점수를 기록하는 프로그램

	public static void main(String[] args) {
		HashMap <String, Integer> javaScore = new HashMap<String, Integer>();
		
		// 5개의 점수를 HashMap에 저장
		javaScore.put("김성동", 97);
		javaScore.put("홍길동", 88);
		javaScore.put("강자바", 75);
		javaScore.put("이순신", 65);
		javaScore.put("한글날", 99);
		
		System.out.println("HashMap에 저장된 요소 갯수 : " + javaScore.size());
		
		// 모든 사람의 이름과 점수를 출력
		Set<String> keys = javaScore.keySet();
		
		// key 문자열을 순서대로 접근하는 Iterator 리턴
		Iterator<String> it = keys.iterator();		// Set에서 순환하면서 출력 
		
		while (it.hasNext()) {
			String name = it.next();
			int score = javaScore.get(name);
			System.out.println(name + " " + score);
		}
	}

}
