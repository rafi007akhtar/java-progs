import java.util.*;

class Add
{
	public static void main(String args[])
	{
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		a = sc.nextInt();
		System.out.print("Enter second number: ");
		b = sc.nextInt();
		System.out.print("Enter third number: ");
		c = sc.nextInt();
		
		int sum = a + b + c;
		
		System.out.println(a + " + " + b + " + " + c + " = " + sum);
	}
}