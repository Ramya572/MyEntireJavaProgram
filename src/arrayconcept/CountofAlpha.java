package arrayconcept;

import java.util.Arrays;

public class CountofAlpha {
static int countofalpha=0;
	public static void main(String[] args) {
		String name="Manisha";
		char c1[]=name.toCharArray();
		System.out.println(Arrays.toString(c1));//[m,a,.....] ee formate li barake akiwi
		
		for(int i=0;i<c1.length;i++) {
			boolean answer=Character.isAlphabetic(c1[i]);//to check if they are alphabets or not
			//System.out.println(answer);
		if(answer==true) {
			countofalpha++;
		}
		}
		System.out.println("The total count of Alphabets are->"+countofalpha);
	}

}
