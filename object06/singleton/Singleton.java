package object06.singleton;

public class Singleton {
		//정적 필드
		private static Singleton singleton = new Singleton();
		
	private Singleton() {}
	
	static Singleton getInstance() {
		return singleton;
	}
}
