package collection.map.hashmap;

import collection.Member;

public class MemberHashMapTest {

	public static void main(String[] args) {
		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member memberLee = new Member(1001, "이순신");
		Member memberKim = new Member(1002, "김유신");
		Member memberHong = new Member(1003, "홍길동");
		Member memberSong = new Member(1004, "송유나");
		
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberKim);
		memberHashMap.addMember(memberHong);
		memberHashMap.addMember(memberSong);
		
		memberHashMap.showAllMember();
		
		memberHashMap.removeMember(1005);
		
	}
}
