//WAP in java to check whether a number is prime or not
import java.util.Scanner;
public class Ass12 
{
  public static void main(String[] args) 
   {

      int num;
      boolean flag = false;
      Scanner hs = new Scanner(System.in);
         System.out.print("Enter a number: ");
         num = hs.nextInt();
      for (int i = 2; i <= num / 2; ++i)
		{
          // condition for nonprime number
          if (num % i == 0) 
	     {
          flag = true;
          break;
         }
        }

       if (!flag)
        System.out.println(num + " is a prime number.");
       else
        System.out.println(num + " is not a prime number.");
    }
}