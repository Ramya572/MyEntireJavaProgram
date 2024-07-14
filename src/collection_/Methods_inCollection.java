package collection_;

import java.util.ArrayList;

public class Methods_inCollection {
public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	a1.add("Anu");
	a1.add("Reema");
	a1.add(33);
	a1.add('n');
	a1.add(true);
	System.out.println(a1);
	a1.remove(0);
	System.out.println(a1);
	a1.remove("Reema");
	System.out.println(a1);
	//a1.clear();
	//System.out.println("after clear "+a1);
	boolean answer=a1.isEmpty();
	System.out.println(answer);
	
	ArrayList a2=new ArrayList();
	a2.addAll(a1);
	System.out.println(a2);
	a2.add(1, 90);
	System.out.println(a2);
	a2.addAll(3, a1);
	System.out.println("before remove->"+a2);
	a2.removeAll(a1);
	System.out.println("after remove->"+a2);
	System.out.println("=====");
	
	
	ArrayList a3=new ArrayList();
	a3=(ArrayList) a2.clone();
	System.out.println("a3 is made just replica of a2->"+a3);
}
}
