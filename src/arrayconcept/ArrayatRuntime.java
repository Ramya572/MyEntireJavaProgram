package arrayconcept;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayatRuntime {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		int usnno[]=new int[2];
		for(int i=0;i<2;i++) {
			System.out.println("Enter the Array->"+i);
			usnno[i]=s1.nextInt();
			//System.out.println(usnno[i]);
		}
System.out.println(Arrays.toString(usnno));
	}

}
