package thisandsuper_keyword;//super calling statement
class Parent{ //parent from child class constructor na call madake
	Parent(){
		System.out.println("parent");
	}
}
class Child extends Parent{
	Child(){
		super();
		System.out.println("child");
	}
}
public class Supercallingstatement {

	public static void main(String[] args) {
		new Child();

	}

}
