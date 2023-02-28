//WAP to calculate the sum of natural numbers upto n
import java.util.Scanner;
class Ass4
{
	public static void main(String arg[])
	{
		int n,i,sum=0;
		Scanner hs=new Scanner(System.in);
		System.out.println("Enter A Number:");
		n=hs.nextInt();
		  for(i=0;i<=n;i++)
		  {
			  sum +=i;
		  }
		System.out.println(sum);
	}
}