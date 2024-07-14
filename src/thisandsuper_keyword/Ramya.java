package thisandsuper_keyword;//this calling statement
//important andre contructor overloading li this() call madidre all writting in main method is unneccary adu ade call madkothawe ok
class Ramya {
	Ramya(){
		this(56);
		System.out.println("ramya");
	}
	Ramya(int a){
		this(6.98);
		System.out.println("ramya_int");
	}
	Ramya(double b){
		System.out.println("ramya_double");
	}
	public static void main(String[] args) {
		Ramya r=new Ramya();

	}

	
}
