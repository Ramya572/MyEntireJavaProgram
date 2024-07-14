package exceptionhandling;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Tryandcatch {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	/*try {
	int age=s.nextInt();
	System.out.println(age);}
	catch(InputMismatchException a1) {
		System.out.println("please enter the correct age");
	}*/
	try{
		int n1=s.nextInt();
		System.out.println("Input->"+n1);
		String name[]=new String[n1];
		name[0]="anu";
		name[1]="priya";
		name[2]="divya";
		name[3]="raj";
		System.out.println(Arrays.toString(name));
	}	
	catch(ArrayIndexOutOfBoundsException a2) {
		System.out.println("size is incorrect");
	}
catch(InputMismatchException a3) {
		System.out.println("enter correct input");
	}
	finally {
		System.out.println("Thank u for visiting");
	}
}
}
