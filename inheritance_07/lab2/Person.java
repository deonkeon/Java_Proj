package inheritance_07.lab2;

public class Person {
	private int weight;		// 몸무게 : private
	int age;				// 나이 : default
	protected int height;	// 키 : protected
	public String name;		// 이름 : public
	
	public void setWeight (int weight) {
		this.weight = weight;
	}
	public int getWeight() {
		return weight;
	}
}
