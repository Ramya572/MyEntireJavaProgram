package assertionprog;

public class Assertionprog1 {
static void add(int a,int b) {
	assert a==100;
	int sum=a+b;
	System.out.println(sum);
}
	public static void main(String[] args) {
		add(10,200);//give (100,200)

	}

}
