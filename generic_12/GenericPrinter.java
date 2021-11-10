package generic_12;

public class GenericPrinter<T> {		// 다양한 재료를 사용하는 프린터 (지능적인 프린터)
									// 다양한 객체 데이터타입을 받아서 처리,
									// Printer 재료 (powder,plastic,etc....)
									// <> 안에 들어가는 T는 type의 약자
	private T material;				// T를 Powder나 Plastic으로 설정시 객체형(인스턴스) 변수가 됨.
	
	public void setMaterial (T material) {	// setter <== material 변수에 값 할당.
		this.material = material;
	}
	public T getMaterial() {		//getter <== material 변수의 값을 돌려줌.
		return material;
	}
	public String toString () {
		return material.toString();
	}
	public void printing () {
		//material.doPriting();
	}
}
