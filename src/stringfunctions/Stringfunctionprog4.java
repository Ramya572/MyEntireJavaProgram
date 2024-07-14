package stringfunctions;

import java.util.Date;

public class Stringfunctionprog4 {

	public static void main(String[] args) {
		Date d1=new Date();
		System.out.println(d1.getTime());//epoch converter
		Date d2=new Date(d1.getTime()+(60*60*1000*24*1));//last li 1 kotare next day du output barute ade thara yast day extra beku ast no baribodu
		System.out.println(d2);
		//last prog du copy
		String input=d2.toString();//yallu string ge convert madu
		System.out.println(input);
	String month=input.substring(4,7);
	System.out.println(month);
	String date=input.substring(8,10);
	System.out.println(date);
	String year=input.substring(input.length()-4);//sop(input.length) =28//thn year=substring(24)
	System.out.println(year);
	System.out.println("=====");
	System.out.println(date.concat(" ").concat(month).concat(" ").concat(year));
	System.out.println(date.concat("-").concat(month).concat("-").concat(year));
	System.out.println(date.concat("/").concat(month).concat("/").concat(year));
		
	}

}
