package collection_;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_prog {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add("geeta");
		a1.add(33);
		a1.add('l');
		System.out.println(a1);
		System.out.println(a1.size());
		System.out.println(a1.contains("sita"));//false bcoz sita no there in arraylist
		System.out.println(a1.contains(33));
		
		Iterator i1=a1.iterator();
		//hasnext, next
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		}

}
