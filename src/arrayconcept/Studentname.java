package arrayconcept;

public class Studentname {

	public static void main(String[] args) {
		String name[]=new String[3];
		//declare and initialize your array
		name[0]="vasavi";
		name[1]="ram   ";
		name[2]="shivani";
		
		int []rollno=new int[3];
		rollno[0]=77;
		rollno[1]=88;
		rollno[2]=99;
		
		char []gender=new char[3];
		gender[0]='F';
		gender[1]='M';
		gender[2]='F';
		System.out.println("student name"+"  "+"rollno"+" "+"gender");
		for(int i=0;i<=2;i++) {
			System.out.println(name[i]+"         "+rollno[i]+"      "+gender[i]);
		}
	}

}
