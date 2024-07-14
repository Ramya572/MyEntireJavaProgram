package collection_;

import java.util.LinkedList;

public class LinkedList_prog {
public static void main(String[] args) {
	LinkedList<Integer> l=new LinkedList();
	l.add(11);
	l.add(300);
	l.add(400);
	l.add(600);
	System.out.println(l);
	System.out.println(l.getFirst());//getting first obj
	System.out.println(l.peekFirst());//same as getFirst
	System.out.println(l.getLast());//getting last obj
	System.out.println(l.peekLast());//same as getLast
	l.addFirst(77);
	System.out.println(l);//add this element on top of ur array
	l.addLast(898);
	System.out.println(l);//add this element on last of ur array
	System.out.println(l.offerFirst(404));//same as addFirst
	System.out.println(l.offerLast(505));//same as addLast
	System.out.println(l);
	System.out.println("poll First->"+l.pollFirst());//same as remove first
	System.out.println("poll last->"+l.pollLast());//same as remove last
	System.out.println(l);
	System.out.println(l.removeFirst());
	System.out.println(l);
	//2 methods for 1 object bcoz ende and munde we can store data
}
}
