package collection_;

public class Throw_prog {
void add() throws  InterruptedException
{
	Thread.sleep(2000);
}
	public static void main(String[] args) throws ClassCastException, InterruptedException{
		Thread.sleep(2000);
		throw new ClassCastException();
	}

}
