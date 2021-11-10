package collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

import collection.Member;

public class MemberHashSet {
	private HashSet<Member> hashSet; 	// HashSet 객체 변수 선언
	
	public MemberHashSet() {
		hashSet = new HashSet<Member>();
	}
	public void addMember(Member member) {
		hashSet.add(member);
	}
	public boolean removeMember(int memberid) {	// 삭제를 할 경우 memberid에 해당하는 값을 검색
		Iterator<Member> ir = hashSet.iterator();
		while(ir.hasNext()) {			// 다음 값이 존재하면 True
			Member member = ir.next();	// 객체를 가지고 와서 member 변수에 저장
			int tempid = member.getMemberid();
			if (tempid == memberid) {
				hashSet.remove(member);
				return true;
			}
			
		}	
		System.out.println("해당 id가 존재하지 않습니다. ");
		return false;
	}
	public void showAllMember() {			// HashSet에 저장된 모든 내용을 출력
		for (Member member : hashSet) {
			System.out.println(member);		// 방번호가 아닌 객체이름으로 삭제
		}
		System.out.println();
		
	}
	
}
