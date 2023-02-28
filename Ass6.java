//WAP to generate multiplication table upto n
import java.util.Scanner;
class Ass6
{
	public static void main(String agr[])
	{
		int i,n;
		Scanner hs= new Scanner(System.in);
		System.out.println("Enter a number:");
		n=hs.nextInt();
		System.out.println("Multiplication of "+ n +" is=\n" );
		for(i=1;i<=10;i++)
	    System.out.println(+ n + " * "+ i + " = " +n * i);
	}
}