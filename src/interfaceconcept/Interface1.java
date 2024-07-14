package interfaceconcept;
interface interface2
{
	void logIn();//abstract method //edu by default public erute adike last nodu bcoz here it is interface
	void logout();
}
interface interface3 extends interface2
{
	void search();
	void payment();
}
public class Interface1 implements interface3
{
	void order_page() {
		System.out.println("order");
	}//concrete method
	static void address_page() {
		System.out.println("address");
	}
	public static void main(String[] args) {
		Interface1 i1=new Interface1();
		i1.order_page();
		address_page();
		i1.logIn();
		i1.logout();
		i1.search();
		i1.payment();
	}

	@Override
	public void logIn() {
		// TODO Auto-generated method stub
		System.out.println("login");
	}//comes as public here

	@Override
	public void logout() {
		// TODO Auto-generated method stub
		System.out.println("logout");
	}

	@Override
	public void search() {
		// TODO Auto-generated method stub
		System.out.println("search");
	}

	@Override
	public void payment() {
		// TODO Auto-generated method stub
		System.out.println("payment");
	}

}
