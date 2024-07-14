package arrayconcept;

public class ArrayAverage {
static int sum=0;
static double average=0;
static int remainder=0;
	public static void main(String[] args) {
		int no[]=new int[4];
		no[0]=41;
		no[1]=21;
		no[2]=11;
		no[3]=1;
		for(int i=0;i<no.length;i++) {
			sum=sum+no[i];
			average=sum/no.length;
			remainder=sum%no.length;
		}
System.out.println(sum);
System.out.println(average);
System.out.println(remainder);
	}

}
