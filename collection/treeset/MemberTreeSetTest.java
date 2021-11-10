package collection.treeset;

import collection.Member2;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member2 memberPark = new Member2 (1001, "박서원");
		Member2 memberLee = new Member2 (1002, "이순신");
		Member2 memberSon = new Member2 (1003, "손오공");
		Member2 memberKim = new Member2 (900, "김유신");
		Member2 memberSong = new Member2 (930,"송유나");
		
		memberTreeSet.addMember(memberPark);
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberSon);
		memberTreeSet.addMember(memberKim);
		memberTreeSet.addMember(memberSong);
		memberTreeSet.showAllMember();	
			// Comparable 인터페이스의 compareTo() 정의에 따라 정렬 (오름차순 정렬, 내림차순 정렬)
		
		System.out.println("======중복된 내용 삽입(equals() 메소드가 재정의 되어야함======");
		Member2 memberSong2 = new Member2 (930,"송유나");
		Member2 memberKim2 = new Member2 (930,"김김김");
			// ID가 같으면 같은 객체 취급이되어 중복처리 ==> 저장불가
		memberTreeSet.addMember(memberSong2);
		memberTreeSet.addMember(memberKim2);
		memberTreeSet.showAllMember();
	}

}
