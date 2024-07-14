package arrayconcept;

public class Arrayfor41 {

	public static void main(String[] args) {
		int nos[]=new int[3];
		nos[0]=41;
		nos[1]=33;
		nos[2]=41;
		
		int givenno=41;
		
		for(int i=0;i<nos.length;i++) {
			if(givenno==nos[i]) {
				System.out.println("Number is present in the given array at the index position "+i);
			}
			else {
				System.out.println("Number is not present in the given array at the index position "+i);
			}
		}

	}

}
