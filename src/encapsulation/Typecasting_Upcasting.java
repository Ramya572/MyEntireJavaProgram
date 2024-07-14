package encapsulation;
class Parent{
	void add() {
		System.out.println("1");
	}
}
public class Typecasting_Upcasting extends Parent {

	public static void main(String[] args) {
		/*upcasting
		Parent t=new Typecasting_Upcasting();
		t.add();
		Parent p1=(Parent) new Typecasting_Upcasting();
		p1.add();
		*/
		//downcasting
		Parent t=new Typecasting_Upcasting();//always after upcasting
		Typecasting_Upcasting t1=(Typecasting_Upcasting) t;
		t1.add();
	}

}
