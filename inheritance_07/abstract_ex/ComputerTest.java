package inheritance_07.abstract_ex;

import java.util.ArrayList;

public class ComputerTest {

	public static void main(String[] args) {
		
		//Computer c1 = new Computer();	// 추상 클래스이므로 객체 생성이 불가 (업캐스팅)
		Computer c2 = new Desktop();	// 콘크리트 클래스이므로 객체 생성 가능
		//Computer c3 = new NoteBook();	// 추상 클래스
		Computer c4 = new MyNoteBook();	// 콘크리트 클래스
		
		System.out.println("==============DeskTop 객체 정보================");
		c2.display();
		c2.typing();
		c2.turnOn();
		c2.turnOff();
		
		System.out.println("==============MyNoteBook 객체 정보================");
		c4.display();
		c4.typing();
		c4.turnOn();
		c4.turnOff();
		
		System.out.println("==============각각의 클래스의 메소드 호출================");
		Desktop d1 = (Desktop) c2;
		MyNoteBook m1 = (MyNoteBook) c4;
		NoteBook n1 = (NoteBook) c4;	// mynotebook이 notebook을 상속받으므로 캐스팅하여 사용가능
		d1.desktoponly();
		m1.myNoteBook();
		n1.noteBookonly();
		
		System.out.println("==============각 클래스를 ArrayList에 저장 후 출력==================");
		ArrayList<Computer> computer = new ArrayList<Computer>();
		Computer desktop = new Desktop();
		Computer mynotebook = new MyNoteBook();		// ==> 또는 위에 c2,c4 선언하였으므로 c2,c4 사용가능
		
		computer.add(desktop);
		computer.add(mynotebook);
		System.out.println("===============instanceof 를 사용하여 다운캐스팅================");
		for(int i = 0; i<computer.size(); i++) {
			Computer c = computer.get(i);
			if(c instanceof Desktop) {
				Desktop d = (Desktop) c;
				d.desktoponly();
			}
			if (c instanceof MyNoteBook) {
				MyNoteBook m = (MyNoteBook) c;
				m.myNoteBook();
			}
			if (c instanceof NoteBook) {
				NoteBook n = (NoteBook) c;
				n.noteBookonly();
			}
		}

	}
		  /*computer.add(c2); //==> Computer/Desktop
		  computer.add(c4); //==> Computer/MyNoteBook
		  
		  Computer c = computer.get(0);
		  c.display();
		  c.typing();
		  c.turnOn();
		  c.turnOff();
		  
		  Desktop dd = (Desktop) c;	// 다운캐스팅
		  dd.desktopOnly();
		  
		  Computer cc = computer.get(1);
		  cc.display();
		  cc.typing();
		  cc.turnOn();
		  cc.turnOff();
		  
		  MyNoteBook mm = (MyNoteBook) cc;
		  mm.noteBookOnly();		// NoteBook의 메소드 //==> 상속받았으므로 접근가능.
		  mm.myNoteBookOnly();		// MyNoteBook의 메소드
		  */
		 
	
	
	
	

}
