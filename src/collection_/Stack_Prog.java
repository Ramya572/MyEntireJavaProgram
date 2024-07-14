package collection_;

import java.util.Stack;

public class Stack_Prog {

	public static void main(String[] args) {
		Stack<String> s=new Stack();
		s.push("20");
		s.push("30");
		s.push("40");
		s.add("50");
		System.out.println(s);
		s.peek();//look at last object without removing it//retriewing last object
		System.out.println(s);
		s.pop();//remove last object
		System.out.println(s);
		
		System.out.println(s.push("111"));
		System.out.println(s);
		System.out.println(s.empty());
		System.out.println(s.search("20"));//bcoz edu last in count madate u know right last in first out
		//ee array li elada number kotre for e.g 208 kotare -1 barute
	}

}
