import java.util.*;

class tools
{
	private int sum, arr[];
	
	public tools()
	{
		sum = 0;
	}
	
	public void init(int n)
	{
		Scanner sc = new Scanner(System.in);
		arr = new int[n];
		System.out.print("Enter " + n + " numbers: ");
		for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
	}
	
	public int computeSum(int n)
	{
		int i;
		for (i = 0; i < n; i++) sum += arr[i];
		return sum;
	}
	
	public float computeAvg(int n)
	{
		return (float)(sum * 1.0)/n;
	}
}

class SumAvg
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int n = sc.nextInt();
		
		tools ob = new tools();
		ob.init(n);
		System.out.println("Sum = " + ob.computeSum(n) + "\nAverage = " + ob.computeAvg(n));
	}
}