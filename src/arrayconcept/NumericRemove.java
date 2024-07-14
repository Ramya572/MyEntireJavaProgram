package arrayconcept;

public class NumericRemove {

	public static void main(String[] args) {
		String input="school123";
		
		String op=input.replace('o', ' ');
		System.out.println(op);
		
		String op1=input.replaceAll("[a-z]","");//remember (a-z) doesn't work
		System.out.println(op1);
		
		String input1="SchooL12";
		String op2=input1.replaceAll("[A-Z]","");//remember (a-z) doesn't work
		System.out.println(op2);
		
		String op3=input.replaceAll("[0-9]", "");
		System.out.println(op3);
	}

}
