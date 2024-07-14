package arrayconcept;

import java.util.Arrays;

public class Copy1arraytoAnother {

	public static void main(String[] args) {
		String name[]=new String[4];
		name[0]="ram";
		name[1]="sita";
		name[2]="gita";
		name[3]="lakshman";
		
		
		String copyname[]=new String[name.length];
		for(int i=0;i<name.length;i++) {
			copyname[i]=name[i];
		}
		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(copyname));
	}

}
