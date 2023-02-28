//WAP to find factorial of a number
import java.util.Scanner;
class Ass5
{
	public static void main(String arg[])
	{
		int i,n,fact=1;
		Scanner hs= new Scanner(System.in);
		System.out.println("Enter a No:");
		n=hs.nextInt();
		for(i=1;i<=n;i++)
		{
			fact *=i;
		}
		System.out.println("Factorial of " + n + " is="+fact);
	}
}