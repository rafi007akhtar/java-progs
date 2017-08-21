// initialize() - take size and array i/ps
// max() - returns max value of array
// min() - returns min value of array
// main() - prints range of the array (max - min)

import java.util.*;

class tools
{
	private int a[];
	void initialize(int n)
	{
		Scanner sc = new Scanner(System.in);
		a = new int[n];
		System.out.print("Enter " + n + " numbers: ");
		for(int i = 0; i < n; i++) a[i] = sc.nextInt();			
	}
	int max(int n)
	{
		int most = a[0];
		for(int i = 1; i < n; i++)
			if(a[i] > most) most = a[i];
		return most;
	}
	
	int min(int n)
	{
		int least = a[0];
		for(int i = 1; i < n; i++)
			if(a[i] < least) least = a[i];
		return least;
	}
}

class Range
{
	public static void main(String args[])
	{
		tools ob = new tools();
		int n;
		System.out.print("Enter size of the array: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		ob.initialize(n);
		int r = ob.max(n) - ob.min(n);
		System.out.println("Range of this array = " + r);
	}
}