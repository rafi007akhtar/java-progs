// Calculate the factorial of 12

class tools
{
	int n;
	int fact()
	{
		if (n == 0)
			return 1;
		int f = 1;
		for (int i = 1; i <= n; i++)
			f *= i;
		return f;
	}
}

class Fact
{
	public static void main(String args[])
	{
		tools ob = new tools();
		ob.n = 12;
		System.out.println("12! = " + ob.fact());
	}
}