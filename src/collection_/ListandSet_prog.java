package collection_;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ListandSet_prog {

	public static void main(String[] args) {
		System.out.println("lets understand everything about List");
		List l1=new ArrayList();
		l1.add("jiya");
		l1.add("bigg boss");
		l1.add("manisha");
		l1.add("abhi");
		System.out.println(l1);//list follow index
		//order of insertion nu eralla when indexing ella andre both are parallel so
		l1.add("jiya");
		System.out.println(l1);//allow duplicates
		l1.add(null);
		l1.add(null);
		l1.add(null);
		System.out.println(l1);//multiple null can be added
		//iterator concept is common in it
		Iterator i1=l1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		System.out.println("lets understand everything about Set");
		Set s1=new HashSet();
		s1.add("anu");
		s1.add("neha");
		s1.add("ishitha");
		s1.add("chinnu");
		System.out.println(s1);//set indexing follow madalla
		s1.add("anu");
		System.out.println(s1);//doesn't allow duplicates
		s1.add(null);
		s1.add(null);
		s1.add(null);
		s1.add(null);
		System.out.println(s1);//only 1 null is taken duplicates not allowed
		//iterator is common in both list and set concept
		Iterator i2=s1.iterator();
		while(i2.hasNext()) {
			System.out.println(i2.next());
		}
	}

}
