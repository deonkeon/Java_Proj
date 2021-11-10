package basic_class_11.object;

public class Book {
	int bookNumber;			// 기본 데이터 타입 (첫글자 소문자 시작, int)
	String bookTitle;		// Wrapper Class : 객체형 데이터 타입 (첫글자 대문자시작, String)
	
	Book (){} // 기본 생성자, [bookNumber <== 0, bookTitle <== Null]
	Book (int bookNumber, String bookTitle){		
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	
	public static void main(String[] args) {
		Book book1 = new Book(200, "개미");
		
		Object o = book1;	//업캐스팅
		
		System.out.println(book1);				// 객체 자체를 출력할 경우 : Object Class의 toString() 메소드가 호출됨.
		System.out.println(book1.toString());	// Object Class의 toString() 메소드는 객체의 주소를 출력해줌.
												// 객체 전체이름 (패키지이름.클래스이름)@해쉬코드(주소)
		
	}

}
