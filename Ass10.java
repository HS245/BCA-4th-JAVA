//WAP in java to reverse a number
import java.util.Scanner;
class Ass10
{
    public static void main(String arg[])
	{
		int num, digit,rev=0;
		Scanner hs= new Scanner(System.in);
		System.out.println("Enter a No: ");
		num= hs.nextInt();
		while(num!=0)
		{
			digit= num%10;
			rev= rev * 10 + digit;
			num/= 10;
		}
		System.out.println("Reversed No: " +rev);
	}
}