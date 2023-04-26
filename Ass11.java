//WAP a program to check palindrome No
import java.util.Scanner;
class Ass11
{
	public static void main(String arg[])
	{
		int n,r,sum=0,temp;
		Scanner hs=new Scanner(System.in);
		System.out.println("Enter a No to Check Palindrome:");
		n=hs.nextInt();
		
		temp=n;
		  while(n>0)
		  {
			  r=n%10; //Getting Reminder
			  sum=(sum*10)+r;
			  n=n/10;
		  }
		  if(temp==sum)
			  System.out.println( temp +  " is a palindrome No.");
		  else
			  System.out.println( temp +  " is Not a palindrome No.");
	}
}