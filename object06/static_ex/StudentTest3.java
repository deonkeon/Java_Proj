package object06.static_ex;

public class StudentTest3 {

	public static void main(String[] args) {

		Student3 studentLee = new Student3();	// 객체를 생성시 serialNum이 증가
		studentLee.studentName = "이자바";
		System.out.println(studentLee.getSerialNum());	//private로 제한해놨기때문에 getter 메소드로 접근
		System.out.println();
		
		Student3 studentKim = new Student3();
		studentKim.studentName = "김자바";
		System.out.println(Student3.getSerialNum());	//getter가 static으로 설정되어 있으므로 객체이름. 으로 호출이 가능함.
		System.out.println();
		
		Student3 studentHong = new Student3();
		studentHong.studentName = "홍자바";
		System.out.println(studentHong.getSerialNum());		
		System.out.println();
	
	}

}

// P 238.239. Calcultator.java , CalcultatorExample.java

// 6장 << 277 - 확인 문제 1번~20번까지. >>