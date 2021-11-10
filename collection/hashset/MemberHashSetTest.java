package collection.hashset;

import collection.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet();
		
		// HashSet에 저장 할 객체를 생성
		Member memberHong = new Member(1001, "홍길동");
		Member memberLee = new Member(1002, "이순신");
		Member memberKim = new Member(1003, "김길동");		// 중복된 값을 저장 할 수 없다.
		

		System.out.println("======HashSet에 객체를 저장======");
		memberHashSet.addMember(memberHong);
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberKim);
		memberHashSet.showAllMember();	// 저장된 객체를 출력 (향상된 for문)
		
		/*
			Set에서 객체를 저장 할 때 중복된 값을 저장하지 않도록 하기 위해서는?
			객체의 특정 변수에 대해서 equals() 메소드를 재정의 해줘야함
		*/
		
		System.out.println("======HashSet에 중복된 값을 저장======");
		Member memberKim2 = new Member(1003, "김길동");		// equals() 메소드가 재정의 되어있다.
		Member memberKim3 = new Member(1003, "김길동");
		memberHashSet.addMember(memberKim2);	// HashSet에 중복된 값을 추가
		memberHashSet.addMember(memberKim3);
		memberHashSet.showAllMember();
		
		System.out.println("======HashSet에서 객체 삭제======");
		memberHashSet.removeMember(1002);
		memberHashSet.removeMember(memberKim.getMemberid());
		memberHashSet.showAllMember();
	}

}
