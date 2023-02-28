//WAP to find out Number of Months and Dayes from a user input number
import java.util.Scanner;
class Ass2
{
	public static void main(String arg[])
	{
		int d,m=0;
		Scanner hs=new Scanner(System.in);
		System.out.println("Enter Days:");
		  d=hs.nextInt();
		while(d>=30)
		{
			d=d-30;
			m++;
		}
		System.out.println("Number of month: "+m);
		System.out.println("Number of  days: "+d);
	}
}