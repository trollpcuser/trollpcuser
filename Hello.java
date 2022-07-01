import java.util.Scanner;
public class Hello 
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in); //This line declares Scn
		System.out.println("Enter the first number");
		int a = input.nextInt(); // This line takes input to a..
		System.out.println("Enter the Second number");
		int b = input.nextInt();
		System.out.println("Enter the Third Number");
		int c = input.nextInt();
		int d = a+b+c;
		System.out.println("Sum of three numbers is " +d);
	}
}
