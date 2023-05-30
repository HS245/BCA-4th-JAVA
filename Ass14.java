//WAP to display Armstrong Number between two intervals.
import java.util.Scanner;
import java.lang.Math;
class Ass14
{
	public static void main(String arg[])
	{
		int low, high,r,i;
        Scanner hs = new Scanner(System.in);
        System.out.print("Enter the lower limit: ");
        low = hs.nextInt();
        System.out.print("Enter the upper limit: ");
        high = hs.nextInt();
        System.out.println("Armstrong numbers between " + low + " and " + high + " are: ");
        for (i = low; i <= high; i++) 
		{
             int digits = 0, result = 0, originalNumber = i;
            while (originalNumber != 0) 
			{
                originalNumber /= 10;
                ++digits;
            }
            originalNumber = i;
            while (originalNumber != 0) 
			{
                r = originalNumber % 10;
                result += Math.pow(r, digits);
                originalNumber /= 10;
            }
            if (result == i) 
			{
                System.out.print(i + " ");
            }
        }
    }
}

