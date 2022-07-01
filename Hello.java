//This is a basic java file shows usage of Scanner in Java
//First We need to import java.util.Scanner
import java.util.Scanner;
public class Hello //We have to declare a public class
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a = input.nextInt();
		System.out.println("Enter the Second number");
		int b = input.nextInt();
		System.out.println("Enter the Third Number");
		int c = input.nextInt();
		int d = a+b+c;
		int avg = d/3;
		Systet.out.println("Sum of three numbers is " +d);
		System.out.println("Average of three numbers is" +avg);
	}

Y are you touching my file
