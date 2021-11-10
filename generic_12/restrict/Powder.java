package generic_12.restrict;

public class Powder extends Material{	//Material을 상속한 재료만 제너릭에서 사용.

	@Override
	public void doPrinting() {
		System.out.println("파우더 재료로 프린팅 합니다. ");
	}

	@Override
	public String toString() {
		return "재료는 파우더 입니다. ";
	}
}	
