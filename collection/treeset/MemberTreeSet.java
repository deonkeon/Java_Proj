package collection.treeset;

import java.util.Iterator;
import java.util.TreeSet;

import collection.Member;
import collection.Member2;

public class MemberTreeSet {
	/* 
		TreeSet, 1.정렬해서 저장, Comparable 인터페이스를 구현 compareTo() 메소드를 재정의
				 2. 중복된 데이터의 저장을 허용하지 않는다.
				 3. index를 가지고 있지 않다.
	*/			 
	
	private TreeSet<Member2> treeSet;	// TreeSet 선언
	
	public MemberTreeSet() {
		treeSet = new TreeSet<Member2>();
	}
	public void addMember(Member2 member) {
		treeSet.add(member);
	}

	public boolean removeMember(int memberid) {
		Iterator<Member2> ir = treeSet.iterator();
		while (ir.hasNext()) {
			Member2 member = ir.next();
			int temid = member.getMemberid();	// treeSet에 저장된 객체의 memberid
			if (temid == memberid) {
				treeSet.remove(member);			// index가 없어 객체 자체를 제거
				return true;
			}
		}
		System.out.println("해당 memberid : " + memberid + "를 찾을 수 없습니다. ");
		return false;
	}
	public void showAllMember() {
		/*System.out.println("=====향상된 For문으로 출력=====");
		for (Member2 member : treeSet) {
			System.out.println(member);
		}*/
		System.out.println("=====Iterator로 출력=====");
		Iterator<Member2> ir = treeSet.iterator();
		while(ir.hasNext()) {
			System.out.println(ir.next());
		}
	}


}
