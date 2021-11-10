package array_05.arraylist;

import java.util.ArrayList;		//다른 패키지의 클래스를 사용할때 import가 필요함.

public class Student {
	int studentID;		// 학번
	String studentName;	// 이름
	ArrayList<Subject> subjectList;	// ArrayList를 사용해서 subjectList 배열변수 선언
	//ArrayList<Subject> subjectList = new ArrayList<subject>();
	//선언과 동시에 ArrayList 객체 배열 생성
	
	public Student (int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		subjectList = new ArrayList<Subject>();	//subjectList 배열 변수 생성
	}
	public void addSubject (String name, int score) { // 
		Subject subject = new Subject ();
		
		subject.setName(name);
		subject.setScorePoint(score);
		subjectList.add(subject);		// 객체를 ArrayList 배열 변수 subjectList에 추가
	}
	public void showStudentInfo() {
		int total = 0;
		for (Subject s : subjectList) {
			total += s.getScorePoint();
			System.out.println("학생 " + studentName + "의 " + s.getName() + " 과목 성적은 " + 
			s.getScorePoint() + "입니다");
		}
		System.out.println("학생 " + studentName + "의 총점은 " + total + "입니다.");
	}
}
