package methodoverridding;
class MethodParent{
	void logIn() {
		System.out.println("login with mobileno");
	}
}
public class MethodOverridding extends MethodParent {
	void logIn() {
		//super.logIn();
		System.out.println("login with email");
		super.logIn();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverridding m1=new MethodOverridding();
		m1.logIn();
	}

}
