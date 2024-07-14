package encapsulation;

public class Typecasting_narrowing {
public static void main(String[] args) {
	/*explicity narrowing
	double pi=3.14;
	int a=(int) pi;
	System.out.println(a);
	*/
	
	//widening
	//int to float
	float a=45;
	int age=68;
	float a1=age;
	float a2=(float) a1;
	System.out.println(a2);
}
}
