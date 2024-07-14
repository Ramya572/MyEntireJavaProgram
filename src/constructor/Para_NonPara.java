package constructor;

public class Para_NonPara {
	Para_NonPara(int a)
	{
		System.out.println("integer");
	}
	Para_NonPara()
	{
		System.out.println("5");
	}
	public static void main(String[] args) {
		new Para_NonPara();
		new Para_NonPara(87);
	}
}
