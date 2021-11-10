package basic_class_11.garbage_collector;

public class Counter {
		// Garbage Collector (가바지 컬렉터) : 메모리의 쓰레기(사용하지 않는 객체) 청소. System.gc();
		// JAVA는 가비지를 JVM이 자동으로 청소해 준다. cpu가 유휴 할 때.
		// finalize() 메소드 : 가비지 컬렉터가 청소하기전에 호출 되는 메소드
		// 객체 소멸 직전에 호출되는 메소드
		// 객체 소멸자 (가비지 컬렉터)는 객체를 소멸 하기 직전 finalize() 메소드를 호출
	private int no;
	public Counter(int no) {
		this.no = no;
	}
	@Override
	protected void finalize() throws Throwable {	// 객체가 삭제 될 때 호출
		System.out.println(no + "번째의 finalize()가 실행됨 (객체 소멸됨)");
	}
	
}
