package interfaceconcept;
interface Keyboard
{
	void logIn();
}
public class Interface implements Keyboard {

	public static void main(String[] args) {
		Interface i1=new Interface();
		i1.logIn();

	}

	@Override
	public void logIn() {
		System.out.println("login with mobileno");
		
	}

}
