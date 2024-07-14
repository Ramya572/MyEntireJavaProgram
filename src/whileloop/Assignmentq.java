package whileloop;

public class Assignmentq {

	public static void main(String[] args) {
		//using math.random need to get radius of 10 circles and need to find 
		for(int i=1;i<=10;i++) {
			double d=Math.random();
			System.out.println("Math random number "+d);
			System.out.println("Area of circle "+(Math.PI*d*d));
			
		}
	}

}
