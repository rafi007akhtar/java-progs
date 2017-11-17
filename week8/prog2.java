package exp;

import java.util.Scanner;

class IllegalArgumentException extends Exception
{
	private int n;
	
	IllegalArgumentException(int n) { this.n = n; }
	
	public String toString()
	{
		return "x should be greater than 0 and less than 20";
	}
}

class prog2
{		
	static void check(int n) throws IllegalArgumentException
	{
		if (n >= 20 || n < 0) 
			throw new IllegalArgumentException(n);
	}
	
	static int fact (int n)
	{		
		if (n == 0 || n == 1) return 1;
		
		int p = 1;
		for (int i = 2; i <=n; i++) p *= i;
		
		return p;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int cache[] = new int[20];
		
		System.out.print("Enter the value of x: ");
		int x = sc.nextInt();
		
		try { check(x) ;}
		catch(IllegalArgumentException e) 
		{ 
			System.out.println(e); 
			System.exit(0);
		}
		
		cache[x] = fact(x);
		System.out.println (x + "! = " + cache[x]);
	}
}