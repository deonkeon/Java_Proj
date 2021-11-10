package generic_12;

public class GenericPrinterTest {

	public static void main(String[] args) {
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		powderPrinter.setMaterial(new Powder());
		
		Powder powder = powderPrinter.getMaterial();
		System.out.println(powderPrinter);
		System.out.println(powder);
		System.out.println("=======================");
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		plasticPrinter.setMaterial(new Plastic());
		
		Plastic plastic = plasticPrinter.getMaterial();
		System.out.println(plasticPrinter);
		System.out.println("=======================");
		
		GenericPrinter<Water> waterPrinter = new GenericPrinter<Water>();
		waterPrinter.setMaterial(new Water());		// 객체 생성 (setter)
		Water water = waterPrinter.getMaterial();	// 객체를 가지고옴 (getter)
		System.out.println(waterPrinter);
		System.out.println(water);
	}

}
