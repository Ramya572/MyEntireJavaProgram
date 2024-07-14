package constructor;

public class MethodOverloading {
	static void add()
	{
		System.out.println("a+b");
	}
	void sub()
	{
		System.out.println("a-b");
	}
	void mul(double a)
	{
		System.out.println(8*8);
	}
	static void div(int a,double b,int c)
	{
		System.out.println(8/2);
	}
	//multiple methods but variation in argument list
	public static void main(String[] args) {
		add();
		MethodOverloading m1=new MethodOverloading();
		m1.sub();
		m1.mul(4.6);
		div(4,8.4,7);
	}

}
