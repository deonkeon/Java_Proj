package basic_class_11.object;

public class Book1 {
	int bookNumber;			// 기본 데이터 타입 (첫글자 소문자 시작, int)
	String bookTitle;		// Wrapper Class : 객체형 데이터 타입 (첫글자 대문자시작, String)
	
	Book1 (){} // 기본 생성자, [bookNumber <== 0, bookTitle <== Null]
	Book1 (int bookNumber, String bookTitle){		
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	
	@Override		// toString() 객체자체를 출력할 때 작동되는 메소드
	public String toString () {
		return bookNumber + "." + bookTitle;		// 객체의 주소를 출력하는 것이 아니라 
	}												// 객체에 존재하는 변수의 정보를 출력
	
	public static void main(String[] args) {
		Book1 book = new Book1(200, "개미");
		
		System.out.println(book);				// 객체 자체 출력 시 자동으로 toString() 메소드 호출
		System.out.println(book.toString());
	}

}
