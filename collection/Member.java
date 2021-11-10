package collection;

public class Member{
			
	private int memberid;
	private String memberName;
	
	public int getMemberid() {
		return memberid;
	}

	public void setMemberid(int memberid) {
		this.memberid = memberid;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public Member(int memberid, String memberName) {
		this.memberid = memberid;
		this.memberName = memberName;
	}

	@Override		// 객체를 프린트(출력)하면 Object(toString() : 객체의 주소를 출력)
					// 재정의
	public String toString() {
		return memberName + " 회원님의 아이디는 " + memberid + "입니다. ";
	}
	
	//@Override		// Object의 equals 메소드는 객체의 주소를 비교 : True or False return
					// 재정의 : 객체내의 memberid를 비교 : True or False return
	public String equals2(Object obj) {		// 업캐스팅 : Object	// override가 아닌 새로운 메소드 생성 equals2
		if (obj instanceof Member) {
			Member member = (Member) obj;	// 다운캐스팅 : Member
			if (this.memberid == member.memberid) {	// 기존의 memberid 와 들어온 객체의 memberid
				return "동일한 회원(객체)입니다. (memberid가 같습니다.)";
			} else {
				return "다른 회원(객체)입니다. ";
			}
		}
		// System.out.println("회원 정보를 찾을 수 없습니다. ");
		return "회원 정보를 찾을 수 없습니다. ";
	}
	
	@Override
	public boolean equals(Object obj) {		// 업캐스팅 : Object	// override가 아닌 새로운 메소드 생성 equals2
		if (obj instanceof Member) {
			Member member = (Member) obj;	// 다운캐스팅 : Member
			if (this.memberid == member.memberid) {	// 기존의 memberid 와 들어온 객체의 memberid
				return true;
			} else {
				return false;
			}
		}
		// System.out.println("회원 정보를 찾을 수 없습니다. ");
		return false;
	}

	@Override
	public int hashCode() {
		return memberid;
	}
	

	public int compareTo (Member member) {
		return (this.memberid - member.memberid);		// 오름차순 정렬 (a~z)
		//return (this.memberid - member.memberid) * (-1); // 내림차순 정렬 (z~a)
	}
	
}
