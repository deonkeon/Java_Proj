package inheritance_07.abstract_template;

public class AICar extends Car{

	@Override
	public void drive() {
		System.out.println("자율 주행을 합니다. ");
		System.out.println("차가 스스로 방향을 전환합니다. ");
	}

	@Override
	public void stop() {
		System.out.println("스스로 멈춥니다. ");
	}
	
	
	
}
