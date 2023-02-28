//WAP a program to count number of digit in an integer
import java.util.Scanner;
class Ass9
{
	public static void main(String arg[])
	{
		int n,count=0;
		Scanner hs=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		n=hs.nextInt();
		int a=n;
		   while (n!=0)
		   {
			   n/=10;  //n=n/10
				count++;
		   }
		  System.out.println("No of Digits in " + a + " is: " + count);
	}
}