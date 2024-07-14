package inheritance;//multi level inheritance
class GrandParent {
	static void add() {
		System.out.println(8+9);
	}
}
class Parentclass1 extends GrandParent{
	void sub() {
	System.out.println(9-4);
	}
}
public class Childclass1 extends Parentclass1 {
	void mul() {
		System.out.println(3*8);
	}
	public static void main(String[] args) {
		add();
		Childclass1 c1=new Childclass1();
		c1.sub();
		c1.mul();
	}

}
