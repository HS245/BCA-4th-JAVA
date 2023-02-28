//WAP to display fibonic series
import java.util.Scanner;
class Ass7
{
	public static void main(String arg[])
	{
		int n,i,sum,t1=0,t2=1;
		Scanner hs=new Scanner(System.in);
		System.out.println("Enter the no of terms:");
		     n=hs.nextInt();
		System.out.println("Fibonacci Series:");
		for(i=1;i<=n;i++)
		{
			System.out.println(t1 + " ");
			sum=t1+t2;
			t1=t2;
			t2=sum;
		}
	}
}
		