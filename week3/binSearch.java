import java.util.*;

class tools
{
	private double a[];
	
	void init(int n)
	{
		Scanner sc = new Scanner(System.in);
		
		a = new double[n];
		System.out.print("Enter " + n + " elements: ");
		for(int i = 0; i < n; i++) a[i] = sc.nextDouble();
	}
	
	int bin_search(double key, int n)
	{
		int l = 0, u = n - 1;
		while (l <= u)
		{
			int mid = (l + u)/2;
			if (key == a[mid]) return mid;
			if (key > a[mid]) l++;
			else u--;
		}
		return -1;
	}
}

class BinSearch
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements: ");
		int n = sc.nextInt();
		
		tools ob = new tools();
		ob.init(n);
		System.out.print("Enter the key to be searched: ");
		double key = sc.nextDouble();
		int res = ob.bin_search(key, n);
		if (res == -1) System.out.println("Search unsuccessful");
		else System.out.println("Element found at position " + (res + 1));
	}
}