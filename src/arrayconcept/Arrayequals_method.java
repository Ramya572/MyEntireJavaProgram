package arrayconcept;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayequals_method {
public static void main(String[] args) {
	System.out.println("Starting of first array->");
	Scanner s1=new Scanner(System.in);
	boolean rollno[]=new boolean[3];
	for(int i=0;i<3;i++) {
		System.out.println("enter array->"+i);
		rollno[i]=s1.nextBoolean();
	}
	System.out.println("Starting of second array->");
	boolean rollno1[]=new boolean[3];
	for(int i=0;i<3;i++) {
		System.out.println("Enter array->"+i);
		rollno1[i]=s1.nextBoolean();
	}
	System.out.println(Arrays.toString(rollno));
	System.out.println(Arrays.toString(rollno1));
	if(Arrays.equals(rollno, rollno1)==true) {
		System.out.println("hey u did magic 2 array are equal");
	}
	else {
		System.out.println("sorry 2 array are not matching");
	}
}
}
