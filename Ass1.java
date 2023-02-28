//WAP To SWAP 2 Numbers Without using 3rd varialbe
import java.util.Scanner;
class Ass1
{
	public static void main(String arg[])
	{
		int a,b;
		Scanner hs=new Scanner(System.in);
		System.out.println("Enter the first No:");
		   a=hs.nextInt();
		System.out.println("Enter the Second No:");
		   b=hs.nextInt();
		System.out.println("Numbers before Swaping: "+ a + " & " + b);
		//now Swaping part
		a=a + b;            //Soppose a=2,b=3   a=2+3= 5 now a=5
		b=a - b;           //                   b=5-3=2 now b=2
		a=a -b;           //                   a=5-2=3 now a=3  
		System.out.println("Numbers After Swaping: "+ a + " & " + b);
	}
}
	