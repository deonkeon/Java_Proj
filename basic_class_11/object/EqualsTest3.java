package basic_class_11.object;



class Student3 {
	int studentID;
	String studentName;
	int grade;	//학년
	public Student3(int studentID, String studentName, int grade) {
		this.studentID = studentID;
		this.studentName = studentName;
		this.grade = grade;
	}
	//문제 : 		//1. toString() 메소드 재정의해서 객체를 출력했을 때, 이름과 학년을 출력
				//2. equals () 메소드 재정의해서 studentName 같을때 True를 리턴 받도록 재정의,
				//3. hashCode() 메소드 재정의
	@Override
	public String toString() {
		return studentName + ", " + grade;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student3) {
			Student3 std = (Student3)obj;
			if(studentName == std.studentName) {
				return true;
			} else {
				return false;
			}
		}
		
		return false;
	}
	@Override
	public int hashCode() {
		return studentID;
	}

}

public class EqualsTest3 {

	public static void main(String[] args) {
		Student3 shin = new Student3(1001, "강자바", 1);
		Student3 shin2 = new Student3(1001, "강자바", 2);
		Student3 shin3 = new Student3(1001, "김똘똘", 3);
		
		System.out.println(shin);
		System.out.println(shin == shin2);
		System.out.println(shin.equals(shin2));
		
		System.out.println("shin의 hashCode : " + shin.hashCode());					// 16진수
		System.out.println("shin2의 hashCode : " + shin2.hashCode());
		
		System.out.println("shin의 실제 주소값 : " + System.identityHashCode(shin));	// 10진수
		System.out.println("shin2의 실제 주소값 : " + System.identityHashCode(shin2));
		System.out.println("shin3의 실제 주소값 : " + System.identityHashCode(shin3));
	}

}
