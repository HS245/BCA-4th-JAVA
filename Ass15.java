//WAP to make simple calculator using switch case.
import java.util.Scanner;
class Ass15
{
	public static void main(String arg[])
	{
		Scanner hs=new Scanner(System.in);
		System.out.print("Enter First Number:");
		double num1=hs.nextDouble();
		System.out.print("Enter Second Number:");
		double num2=hs.nextDouble();
		System.out.print("Enter an operator (+,-,*,/):");
		char operator=hs.next().charAt(0);
		hs.close();
		double result;
		switch(operator)
		{
		case '+':
		        result=num1 + num2;
				break;
	    case '-':
		        result=num1 - num2;
				break;
		case '*':
		        result=num1 * num2;
				break;
		case '/':
		        result=num1 / num2;
				break;
		default:
		System.out.println("Invalid Operator");
		return;
	    }
	System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
    }
}