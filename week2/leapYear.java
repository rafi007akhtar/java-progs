// Check if a year is leap year or not

import java.util.*;

class tools
{
	boolean isLeap(int n)
	{
		if (n > 100) 
		{
			if (n%4 == 0 && n%100 != 0)
				return true;
			return false;
		}
		else
		{
			if (n%4 == 0) return true;
			return false;
		}
	}
}

class leapYear
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter year: ");
		int n = sc.nextInt();
		
		tools ob = new tools();
		System.out.println("It is " + ob.isLeap(n) + " that this year is a leap year");
	}
}