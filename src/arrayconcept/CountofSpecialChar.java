package arrayconcept;

import java.util.Arrays;

public class CountofSpecialChar {
	static int countofalpha=0;
	static int countofspace=0;
	static int countofnumber=0;
	static int countofspecialChar=0;
	public static void main(String[] args) {
		String name="Manisha12%$&";
		char c1[]=name.toCharArray();
		System.out.println(Arrays.toString(c1));//[m,a,.....] ee formate li barake akiwi
		
		int LengthofString=name.length();
		System.out.println("Tht total no of string:"+LengthofString);
		System.out.println("=====");
		
		for(int i=0;i<c1.length;i++) {
			boolean answer=Character.isAlphabetic(c1[i]);//to check if they are alphabets or not
			//System.out.println(answer);
		if(answer==true) {
			countofalpha++;
		}
		boolean answer1=Character.isSpaceChar(c1[i]);
		if(answer1==true) {
			countofspace++;
		}
		boolean answer2=Character.isDigit(c1[i]);
		if(answer2==true) {
			countofnumber++;
		}
		}
		System.out.println("The total count of Alphabets are->"+countofalpha);
		System.out.println("The total count of spaces are->"+countofspace);
		System.out.println("The total count of number are->"+countofnumber);
		
		int TotalCount=countofalpha+countofnumber+countofspace;
		//System.out.println("The Count of alphabet,space,number:"+TotalCount);
		countofspecialChar= name.length()-TotalCount;
		System.out.println("The total count of specialchar->"+countofspecialChar);
	}
}
