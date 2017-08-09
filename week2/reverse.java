// Reverse a number

import java.util.*;

class tools
{
	int n;
	void reverse()
	{
		int rev = 0;
		while(n > 0)
		{
			rev = rev*10 + n%10;
			n /= 10;
		}
		System.out.println("Reverse of this number = " + rev);
	}
}

class Reversal
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		tools ob = new tools();
		
		System.out.print("Enter number: ");
		ob.n = sc.nextInt();
		ob.reverse();
	}
}