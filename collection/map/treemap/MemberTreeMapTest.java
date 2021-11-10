package collection.map.treemap;

import collection.Member2;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		MemberTreeMap memberTreeMap = new MemberTreeMap();
		
		Member2 memberPark = new Member2(1001, "박문수");
		Member2 memberSon = new Member2(1002, "손흥민");
		Member2 memberKim = new Member2(1003, "김유신");
		Member2 memberSong = new Member2(1004, "송하나");
		
		memberTreeMap.addMember(memberPark);
		memberTreeMap.addMember(memberSon);
		memberTreeMap.addMember(memberKim);
		memberTreeMap.addMember(memberSong);
		memberTreeMap.showAllMember();
		
		System.out.println();
		memberTreeMap.removeMember(1002);
		memberTreeMap.removeMember(memberKim.getMemberid());
		memberTreeMap.showAllMember();
	}

}
