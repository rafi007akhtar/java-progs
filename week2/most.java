// Find the greatest b/w 2 numbers
import java.util.*;

class tools
{
	int greatest(int a, int b)
	{
		return (a > b) ? a : b;
	}
}

class Most
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		tools ob = new tools();
		System.out.println("Maximum number = " + ob.greatest(a, b));
	}
}