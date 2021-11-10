package inheritance_07.abstract_ex;

public abstract class NoteBook extends Computer {
	 	// 추상 클래스 : 슈퍼클래스의 메소드 일부만 구현한 경우, 추상클래스가 되어야 한다.
	@Override
	public void display() {
		System.out.println("노트북 모니터");
	}
	public void noteBookonly () {
		System.out.println("노트북에만 존재하는 메소드 - noteBookonly" );
	}

}
