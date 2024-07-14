package constructor;

public class ConstructorOverloading {
	ConstructorOverloading()
	{
		System.out.println("geetha");
	}
	ConstructorOverloading(double a)
	{
		System.out.println("double");
	}
	//multiple constructor but variation in argument list
	public static void main(String[] args) {
		
		new ConstructorOverloading();
		new ConstructorOverloading(4.9876);
	}

}
