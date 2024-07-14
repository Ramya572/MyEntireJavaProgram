package stringfunctions;

public class StringFunction {

	public static void main(String[] args) {
		String name="School";
		System.out.println(name.length());
		//int length_of_the_string=name.length();//other way
		//System.out.println(length_of_the_string);
		System.out.println(name.charAt(2));//index no from name
		System.out.println(name.indexOf('l'));//l letter du index no
		System.out.println(name.toUpperCase());//capital letter agute
		System.out.println(name.toLowerCase());//small letter agute yalla
		System.out.println(name.concat(" name is ABC public school"));//given string will combine with string school our local variable
		String first_name="Ramya";
		String last_name="T";
		System.out.println(first_name.concat(" ").concat(last_name));//space ge extra concat(" ") baribeku
		System.out.println(name.contains("Scho"));//contains inside ero value given string jote match agabeku awaga true ella false//amele case sensitive edu
	}

}
