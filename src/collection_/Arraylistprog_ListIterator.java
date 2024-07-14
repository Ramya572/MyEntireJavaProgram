package collection_;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Arraylistprog_ListIterator {

	public static void main(String[] args) {
		System.out.println("lets understand list iterator specifically");
		List l1=new ArrayList();
		l1.add("ravi");
		l1.add("sara");
		l1.add("riza");
		l1.add("deepi");
		System.out.println(l1);
		
			ListIterator i1=l1.listIterator();
			while(i1.hasNext()) {
				System.out.println(i1.next());
			}
			System.out.println("=====");
			while(i1.hasPrevious()) {
				System.out.println(i1.previous());
			}
	}

}
