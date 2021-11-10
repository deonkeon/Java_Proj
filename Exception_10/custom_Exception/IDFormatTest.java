package Exception_10.custom_Exception;

public class IDFormatTest {
	private String userID;			// userID : NULL을 넣을 경우 - 사용자 정의 Exception 발생
									// userID : 8자이상 20이하가 아닌 경우 - 사용자 정의 Exception 발생
	public String getUserID() {
		return userID;
	}
	
		// throw : 강제로 Exception을 발생 시킬 때 사용
		// throws : Exception을 미룰 때 사용
	
	public void setUserID(String userID) throws IDFormatException {
		
		if (userID == null) {	//userID가 null 인 경우 : 강제로 Exception 발생
			throw new IDFormatException("아이디는 null일 수 없습니다. ");		
							// throwable 메소드 호출하여 detail message 저장
		}
		else if (userID.length() < 8 || userID.length() > 20) {
			throw new IDFormatException("아이디는 8자 이상 20자 이하로 쓰세요. ");
		}
		this.userID = userID;
	}	
	
	public static void main(String[] args) {
		IDFormatTest test = new IDFormatTest();	// Exception을 처리할 객체 생성
		
		String userID = null;
		/*
		try {
			test.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
		*/
		
		
		// userID에 Null을 넣은 경우 , String userID = null;
		try {
			test.setUserID(userID);
		} catch (IDFormatException e1) {
			System.out.println(e1.getMessage());	// 상위 Throwable 메소드에서 상속, 
		}											// detail message return
			
		userID = "1234567";
		try {
			test.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
	}

}
