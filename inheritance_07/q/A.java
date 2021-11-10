package inheritance_07.q;

public class A {	// q패키지의 A class, r패지의 B class에서 상속 실습 << 다른 패키지에서 접근
		private int pri;		// private 접근 제한자   : 같은 클래스 내에서만 호출/사용
		int def;				// default 접근 제한자   : 같은 패키지내에서 호출/사용
		protected int pro;		// protected 접근 제한자 : 상속된 다른 패키지 호출/사용
		public int pub;			// public 접근 제한자    : 다른 패키지에서 호출/사용

		public void setA() {
			pri = 5;
		}	
}
