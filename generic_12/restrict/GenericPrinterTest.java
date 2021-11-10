package generic_12.restrict;

public class GenericPrinterTest {

	public static void main(String[] args) {
		System.out.println("============Plastic 재료로 프린팅==============");
		GenericPrinter <Plastic> plasticPrinter = new GenericPrinter <Plastic>();
		plasticPrinter.setMaterial(new Plastic());		// 객체 생성
		Plastic plastic = plasticPrinter.getMaterial(); // 객체 생성 및 변수 값 설정
		System.out.println(plastic);					
		System.out.println(plasticPrinter);
		plastic.doPrinting();
		plasticPrinter.doPrinting();
		System.out.println();
		
		System.out.println("============Powder 재료로 프린팅==============");
		GenericPrinter <Powder> powderPrinter = new GenericPrinter <Powder>();
		powderPrinter.setMaterial(new Powder());		// 객체 생성
		Powder powder = powderPrinter.getMaterial(); // 객체 생성 및 변수 값 설정
		System.out.println(powder);					
		System.out.println(powderPrinter);
		powder.doPrinting();
		powderPrinter.doPrinting();
		System.out.println();
		
		// 컴파일전 강하게 데이타 타입을 체크
		/*System.out.println("============Water 로 프린팅==============");
		GenericPrinter <Water> waterPrinter = new GenericPrinter <Water>();
		waterPrinter.setMaterial(new Water());		// 객체 생성
		Water water = waterPrinter.getMaterial(); // 객체 생성 및 변수 값 설정
		System.out.println(water);					
		System.out.println(waterPrinter);
		water.doPrinting();
		waterPrinter.doPrinting();*/
	}

}
