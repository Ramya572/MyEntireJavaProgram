package collection_;
//import java.lang.exc//to see all exception
public class Thread_prog {

	public static void main(String[] args) throws InterruptedException,NullPointerException {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
			Thread.sleep(2000);//2 sec late madute by sleep 2 sec operation
		}
		throw new ClassCastException("Conversion from String into boolean not possible");//with or without msg u can write
	}

}
