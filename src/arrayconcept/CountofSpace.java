package arrayconcept;

import java.util.Arrays;

public class CountofSpace {
	static int countofspace=0;
	public static void main(String[] args) {
		String name="Manisha kumar tiwari";
		char c1[]=name.toCharArray();
		System.out.println(Arrays.toString(c1));//[m,a,.....] ee formate li barake akiwi
		
		for(int i=0;i<c1.length;i++) {
			boolean answer=Character.isSpaceChar(c1[i]);//to check if they are alphabets or not
			//System.out.println(answer);
		if(answer==true) {
			countofspace++;
		}
		}
		System.out.println("The total count of Spaces are->"+countofspace);
	}
}
