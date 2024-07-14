package collection_;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Sortmethod {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(92);
		a.add(65);
		a.add(45);
		a.add(-87);
		a.add(987);
		//same data type ok na
		System.out.println(a);
		a.set(2, "gita");
		System.out.println(a.get(1));
		System.out.println(a.indexOf(-87));
		//Collections.sort(a);//ClassCastException barute bcoz int input ede so string is not accepted
		System.out.println("afer sortind->"+a);
	}

}
