package static_NonStatic;

public class NonStatic1 {
void sub()
{
	System.out.println(4-2);
}
	public static void main(String[] args) {
		
		NonStatic1 n1=new NonStatic1();
		n1.sub();
	}

}
