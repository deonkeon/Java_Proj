package collection.map.treemap;

import java.util.Iterator;
import java.util.TreeMap;
import collection.Member2;

/*

	TreeMap : 1. Key-Value 쌍으로 저장, Key는 중복된 값을 넣을 수 없다. Value는 가능 
			  2. Tree는 정렬해서 저장, 출력 <Comparable 인터페이스의 compareTo() 메소드를 재정의 해줘야함>
			  		comparTo() : 정렬을 정의, (오름차순, 내림차순)
*/
public class MemberTreeMap {
	private TreeMap<Integer, Member2> treeMap;
	public MemberTreeMap() {
		treeMap = new TreeMap<Integer, Member2>();
	}
	public void addMember(Member2 member) {
		treeMap.put(member.getMemberid(), member);		// key & value
	}
	public boolean removeMember(int memberid) {
		if (treeMap.containsKey(memberid))	{	// containskey : key만 검색
			treeMap.remove(memberid);			// Map에서 key만 삭제 가능 (value는 삭제 못함)
			return true;
		}
		System.out.println(memberid + " 가 존재하지 않습니다. ");
		return false;
	}
	public void showAllMember() {
		Iterator<Integer> ir = treeMap.keySet().iterator();
		while (ir.hasNext()) {
			int key = ir.next();
			Member2 member = treeMap.get(key);	//key의 value 값을 가져온다(member 객체)
			System.out.println(member);
		}
		System.out.println();
		for (Integer a : treeMap.keySet()) {
			Member2 member = treeMap.get(a);
			System.out.println(member);
		}
	}
}
