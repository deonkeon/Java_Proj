package inheritance_07.r;
import inheritance_07.q.A;	// 다른 패키지에 있는 클래스를 사용할 때 import가 필요
public class B extends A {
	void set() {
		pub = 1;	// 모든 곳에서 접근 허용
		pro = 2;	// 상속 관계에 있을 때 다른 패키지에서 접근 가능
		//def = 3;	// 다른 패키지에서 접근 불가
		//pri = 4;	// 같은 클래스에서만 접근 가능
	}
	void showInfo() {
		System.out.println("pub : " + pub);
		System.out.println("pro : " + pro);
		//System.out.println("def : " + def);
		//System.out.println("pri : " + pri);
	}
	
}
