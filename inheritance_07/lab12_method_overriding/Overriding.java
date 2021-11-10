package inheritance_07.lab12_method_overriding;

class Weapon {
	protected int fire() {
		return 1;		// 무기의 레벨, 기본적으로 무기는 1명만 살상
	}
}
class Cannon extends Weapon {	// 대포, 무기 살상 레벨 10 살상
	@Override
	protected int fire() {
		return 10;		// 살상 레벨 10
	}
	protected void info() {
		System.out.println("대포는 살상능력이 큽니다");
	}
}

public class Overriding {

	public static void main(String[] args) {
		Weapon weapon;
		weapon = new Weapon();
		System.out.println("기본 살상 능력은 " + weapon.fire());	
		weapon = new Cannon();	// 업캐스팅
		System.out.println("대포의 살상 능력은 " + weapon.fire());	// 오버라이딩 메소드
		
		Cannon c = (Cannon)weapon;	// 다운 캐스팅
		c.info();	// Cannon의 메소드 호출
	}

}
