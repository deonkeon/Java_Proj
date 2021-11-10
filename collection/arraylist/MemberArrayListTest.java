package collection.arraylist;

import collection.Member;
public class MemberArrayListTest {

	public static void main(String[] args) {
		// MemberArrayList 객체를 생성하는 순간, ArrayList<Member>가 생성.
		MemberArrayList memberArrayList = new MemberArrayList();
		
		// Member 객체 생성
		Member memberLee = new Member (1001, "이지원");
		Member memberSon = new Member (1002, "손민국");
		Member memberPark = new Member (1003, "박서원");
		Member memberHong = new Member (1004, "홍길동");
		Member memberSon2 = new Member (1002, "손민국");
		Member memberPark2 = new Member (1003, "박서원");
		
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);
		memberArrayList.addMember(memberSon2);	// 중복된 값도 저장됨
		/*
		 * ArrayList의 특징
		 * 	1. 방번호(Index)를 가지고 있어서 순차적으로 저장됨
		 * 	2. 중복된 값을 저장 할 수 있다.
		 *  3. 방의 갯수가 무한정 늘어난다. (가변적)
		 *  4. 삭제할 경우 바로 뒤의 값이 자동으로 당겨온다.
		 *  5. 특정방에 값을 넣을 때도 자동으로 값이 뒤로 밀려들어간다.
		 */
		
		memberArrayList.showAllMember();	//ArrayList 내에 있는 모든 맴버를 출력
		memberArrayList.addMember2(3, memberPark2);	// 특정 방(index 3)에 객체 추가
		memberArrayList.showAllMember();
		
		System.out.println("========맴버 비교(equals2() 메소드 사용========");
		System.out.println(memberSon.equals2(memberLee));
		System.out.println(memberSon.equals2(memberSon2));
		
		System.out.println("========ArrayList의 값을 삭제========");	
		memberArrayList.removeMember(1003);
		memberArrayList.removeMember(memberHong.getMemberid());
		memberArrayList.showAllMember();
		
		
	}

}
