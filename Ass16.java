//WAP to convert a binary number to decimal number & vice-versa.
import java.util.Scanner;
class Ass16
{
	public static void main(String arg[])
	{
		Scanner hs=new Scanner(System.in);
		System.out.print("Enter 1 to convert Binary to Decimal, or 2 to convert Decimal to Binary:");
		int choice= hs.nextInt();
		if(choice==1)
		{
			System.out.print("Enter a Binary number:");
			String binaryString=hs.next();
			int decimal= Integer.parseInt(binaryString,2);
			System.out.print("Decimal equivalent of " + binaryString + " is " + decimal);
		} else if (choice==2)
		{
            System.out.print("Enter a Decimal number:");
			int decimal=hs.nextInt();
			String binaryString=Integer.toBinaryString(decimal);
			System.out.print("Binary equivalent of " + decimal + " is " + binaryString);
		} else 
		{
			System.out.println("Invalid Choice");
		}
	}
}
	