package collection.map.hashmap;

import java.util.HashMap;
import collection.Member;
import java.util.Iterator;
	/*
	 * 	Map : 1. Key-Value 쌍으로 저장
	 * 		  2. Key 에는 중복된 값을 넣을 수 없다.
	 * 			- Value 에는 중복된 값을 넣을 수 있다.
	 * 		  3. 방번호가 없다. (index 값이 없음)
	 * 		  4. Key는 Hash 알고리즘을 사용해서 검색이 빠르다. ( index = hash(key) )
	 * 				- Hash 알고리즘은 검색이 제일 빠른 알고리즘이다.
	 * 		  5. HashMap - 순서 없이 저장
	 * 		  6. TreeMap - 순서를 가지고 저장, 출력(오름차순, 내림차순)
	 */

public class MemberHashMap {
	private HashMap<Integer, Member> hashMap; // HashMap : Key, Values

	public MemberHashMap() { // 생성자
		hashMap = new HashMap<Integer, Member>(); // HashMap 생성
	}

	public void addMember(Member member) {
		hashMap.put(member.getMemberid(), member);	// HashMap에 값을 저장할때 Put() 메소드 사용.
	}

	public boolean removeMember(int memberid) {
		if (hashMap.containsKey(memberid)) {	// HashMap에서 검색 할 때
												// containsKey() 키 값을 검색
			hashMap.remove(memberid);			// HashMap에서는 Key를 삭제하면 Key-value 가 삭제
			return true;
		}
		System.out.println("그런 " + memberid + "가 존재하지 않습니다. ");
		return false;
	}

	public void showAllMember() {
		Iterator<Integer> ir = hashMap.keySet().iterator();
		while (ir.hasNext()) {
			int key = ir.next();
			Member member = hashMap.get(key);	// get(key) : key에 대한 Value 값을 가져옴
			System.out.println(member);
		}
		System.out.println();
		
		for(Integer i : hashMap.keySet()) {
			Member member = hashMap.get(i);
			System.out.println(member);
		}	
		
		
	}
}
