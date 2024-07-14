package arrayconcept;

public class StudExceptiondu {

	public static void main(String[] args) {
		Boolean check[]=new Boolean[3];
		check[0]=true;//input given at compile time
		check[1]=false;
		check[2]=true;
		for(int i=0;i<4;i++) {
			System.out.println(check[i]);
		}

	}

}
