package arrayconcept;//String function - 3 - MATCHES

import java.util.Arrays;

public class MatchesFunction {

	public static void main(String[] args) {
		String input="School";
		System.out.println(input.matches("s(.*)"));
		System.out.println(input.matches("(.*)l"));
		System.out.println(input.matches("......"));
		int output=input.lastIndexOf('o');
		System.out.println(output);
		
		//String function - 4 -REPEAT
		System.out.println(input.repeat(5));
		
		//String function - 5 -SPLIT
		String ip="My name is ramya";
		String []op=ip.split(" ");//u have given space so wherever it see space it will split or u give a it will split when it see a ok
		System.out.println(Arrays.toString(op));
		
	}

}
