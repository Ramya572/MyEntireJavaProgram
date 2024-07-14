package arrayconcept;//override is not possible bcoz main method is static

public class Overloadmainmethod {

	public static void main(String[] args) {
		System.out.println("1");
		main("asd");
	}
	public static void main() {
		System.out.println("2");
	}
	public static void main(int a) {
		System.out.println("3");
		
	}
	public static void main(String b) {
		System.out.println("4");
		main(89);
	}

}
