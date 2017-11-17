package exp;

class IllegalArgumentException extends Exception
{
	private int n;
	
	IllegalArgumentException(int n) { this.n = n; }
	
	public String toString()
	{
		return "x cannot be 0";
	}
}

class prog4
{
	static void check(int n) throws IllegalArgumentException
	{
		if (n == 0) 
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
		int x = 0;
		try
		{
			x = Integer.valueOf(args[0]);
			check(x);
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
			System.exit(0);
		}
		catch (NumberFormatException e)
		{
			e.printStackTrace();
			System.exit(1);
		}
		catch (IllegalArgumentException e)
		{
			System.out.println(e);
			System.exit(2);
		}
		
		System.out.println(x + "! = " + fact(x));
	}
}