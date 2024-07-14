package inheritance;//single level inheritance
class ParentClass{
	void multi() {
		System.out.println(3*6);
	}
}
public class ChildClass extends ParentClass {
	static void add() {
		System.out.println(2+9);
	}
	public static void main(String[] args) {
		ChildClass c1=new ChildClass();
		add();
		c1.multi();
	}
}
