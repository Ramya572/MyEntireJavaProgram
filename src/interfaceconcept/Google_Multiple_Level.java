package interfaceconcept;//multiple level inheritance
interface Youtube
{
	void watch_later();
	void play();
}
interface Gmail 
{
	void send_schedule();
	void inbox();
	
}
public class Google_Multiple_Level implements Youtube,Gmail{
	static void outlook() {
		System.out.println("outlook");
	}
	public static void main(String[] args) {
		outlook();
		Google_Multiple_Level g1=new Google_Multiple_Level();
		g1.send_schedule();
		g1.inbox();
		g1.watch_later();
		g1.inbox();

	}

	
	@Override
	public void send_schedule() {
		// TODO Auto-generated method stub
		System.out.println("send");
	}

	@Override
	public void inbox() {
		// TODO Auto-generated method stub
		System.out.println("inbox");
	}

	@Override
	public void watch_later() {
		// TODO Auto-generated method stub
		System.out.println("watch");
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("play");
	}

}
