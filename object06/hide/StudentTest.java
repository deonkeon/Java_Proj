package object06.hide;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
		// studentLee.studentName = "이똘똘";	//private : 접근 불가
		studentLee.setStudentName("이똘똘"); //private으로 선언된 변수에 setter를 통해서 변수 값 할당.
		
		System.out.println("이름 출력 : " + studentLee.getStudentName());//getter를 통해서 변수의 값을 받아온다.
		
	}

}
