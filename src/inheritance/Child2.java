package inheritance;//herercial level inheritance
class Parent {
	static void add() {
		System.out.println(7+9);
	}
	
}
class Child1 extends Parent{
	 void sub() {
		System.out.println(8-5);
	}
}
public class Child2 extends Parent{
	
	public static void main(String[] args) {
		Child1 c=new Child1();
		c.sub();
		add();
		
	}

}
