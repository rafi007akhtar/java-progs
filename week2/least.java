// Find the smallest number among 3 numbers

import java.util.*;

class tools
{
	int lowest(int a, int b, int c)
	{
		int min = a;
		if (b < min) min = b;
		if (c < min) min = c;
		return min;
	}
}

class Least
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		tools ob = new tools();
		System.out.println("Minimum number = " + ob.lowest(a, b, c));
	}
}