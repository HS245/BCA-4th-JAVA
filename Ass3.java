//WAP to find out largest among 3 number using nested if else and also using logical operation
import java.util.Scanner;
class Ass3
{
	public static void main(String arg[])
	{
		int a,b,c;
		Scanner hs=new Scanner(System.in);
		System.out.println(" Enter any 3 Numbers:");
		a=hs.nextInt();
		b=hs.nextInt();
		c=hs.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println(+a+" is the largest No.");
		}
		if(b>a && b>c)
		{
			System.out.println(+b+" is the largest No.");
		}
		else
		{	
	      System.out.println(+c+" is the largest No.");
		}
	}
}