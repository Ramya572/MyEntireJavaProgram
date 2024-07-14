package thisandsuper_keyword;//this keyword

public class Fortyclass {
	
	int age;
	String name;
	double salary;
	
	void stud_detail(int age,String name,double salary) {
		
		this.age=age;
		this.name=name;
		this.salary=salary;
	}
	public static void main(String[] args) {
		Fortyclass f=new Fortyclass();
		f.stud_detail(90, "ram", 5000.90);
		System.out.println(f.age);
		System.out.println(f.name);
		System.out.println(f.salary);

	}

}
