package inheritance_07.p;

public class B extends A{
	void set () {
		pub = 1;	//public
		pro = 2;	//protected
		def = 3;	//[default]
		//pri = 4;	//private
	}
	public void showInfo() {
		System.out.println("pub : " + pub);
		System.out.println("pro : " + pro);
		System.out.println("def : " + def);
		//System.out.println("pri : " + pri);
	}

}
