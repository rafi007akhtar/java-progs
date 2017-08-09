// Check whether a program is buzz number (divisible by 7 or ends in 7) or not

import java.util.*;

class tools
{
	boolean isBuzz(int n)
	{
		if (n%7 == 0 || n%10 == 7) return true;
		return false;
	}
}

class Buzz
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		
		tools ob = new tools();
		if(ob.isBuzz(n)) System.out.println("The number is a Buzz number");
		else System.out.println("The number is not a Buzz number");
	}
}