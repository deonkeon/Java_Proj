package generic_12.restrict;

public class GenericPrinter<T extends Material> {	// extends Material : 데이터 타입의 접근 제한
	
	private T material;				
	
	public void setMaterial (T material) {	// setter <== material 변수에 값 할당.
		this.material = material;
	}
	public T getMaterial() {		//getter <== material 변수의 값을 돌려줌.
		return material;
	}
	public String toString () {
		return material.toString();
	}

	public void doPrinting() {
		 material.doPrinting();
	}


}
