package collection_;

public class StringBuffer_prog {

	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("Manual");//mutable
		s=s.append(" Testing");//modified older string
		System.out.println(s);
		System.out.println(s.reverse());//to reverse the string
		
		String s1="Automation";//immutable
		s1=s1.concat(" Testing");//created the new string
		System.out.println(s1);
		
		StringBuffer s2=new StringBuffer("Once upon a time");
		s2=s2.append(",there was a dragon");
		s2=s2.insert(28, " brave");//insert brave right before dragon
		s2=s2.append(" who guarded a treasure.");
		System.out.println(s2);
	}

}
