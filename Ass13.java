//WAP in java to display prime numbers between two intervals.
import java.util.Scanner;
class Ass13 
   {
	   
	     public static void main(String arg[]) 
		 {
         int low, high,i;
         Scanner hs = new Scanner(System.in);
         System.out.print("Enter the lower bound: ");
         low = hs.nextInt();
         System.out.print("Enter the upper bound: ");
         high = hs.nextInt();
         hs.close();
         System.out.println("Prime numbers between " + low + " and " + high + " are: ");
         for (i = low; i <= high; i++)
			{
             int j;
             for (j = 2; j < i; j++)
			   {
                  if (i % j == 0) 
				   {
                     break;
                   }
               }
              if (i == j) 
			  {
                 System.out.print(i + " ");
              }
            } 
	}
}	