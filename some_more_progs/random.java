import java.util.*;

class monopoly
{
	private int l, u;
	
	public monopoly() 
	{ 
		l = 0; 
		u = 1;
	}
	
	public monopoly(int l, int u) // parameterized cons
	{
		this.l = l;
		this.u = u;
	}
	
	static int genRandom(int l, int u)
	{
		return (int)((Math.random() * u) + l);
	}
	
	int monopolyRoll()
	{
		int a = genRandom(l, u);
		int b = genRandom(l, u);
		int sum = a + b;
		if (a != b) return sum;
		return sum + genRandom(l, u) + genRandom(l, u);
	}
}

class Random
{
	public static void main(String args[])
	{
		monopoly m = new monopoly(1, 6);
		System.out.println(m.monopolyRoll());
	}
}