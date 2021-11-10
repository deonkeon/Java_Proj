package object06.static_ex;

public class Student {

	public static int serialNum = 1000; // static : 메모리의 stack 영역에 생성
										// new 없이도 접근이 가능 : 객체 생성없이도 접근
										// 각각의 객체가 공유하는 메모리 영역
										// 인스턴스 생성보다 먼저 생성됨.
	int studentID;
	String studentName; // ==> new를 써야 호출이 가능함.
	int grade;
	String address;

	public String getStduentName() { // 변수의 값을 return
		return studentName;
	}

	public void setStudentName(String StudentName) { // 변수의 값을 할당
		this.studentName = studentName;
	}

	public static int getSerialNum() {
		int i = 10;
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum; // static(정적멤버) : new keyword 없이도 객체 이름.변수이름으로 접근 및 호출이 가능.
	}

}
