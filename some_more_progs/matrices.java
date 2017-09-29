/**
 * Take two matrices, A and B, and multiply them (more operations to come)
**/

import java.util.*;

class matTools
{
	private int a[][], b[][], c[][];
	int p, q, r;
	// Order of A = p x q; B = q x r; C = p x r
	
	public matTools(int p, int q, int r)
	{
		this.p = p;
		this.q = q; 
		this.r = r;
		a = new int[p][q];
		b = new int[q][r];
		c = new int[p][r];
	}
	
	public void init() // initialize the three matrices
	{
		int i, j;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nEnter elemenets of first matrix:");
		for (i = 0; i < p; i++)
		{
			for (j = 0; j < q; j++)
				a[i][j] = sc.nextInt();
		}
		
		System.out.println("\nEnter elemenets of second matrix:");
		for (i = 0; i < q; i++)
		{
			for (j = 0; j < r; j++)
				b[i][j] = sc.nextInt();
		}
		
		System.out.println();
	}
	
	public void multiply()
	{
		int i, j, k;
		// c[i,j] = sum(a[i,k] * b[k,j]) from k = 0 to n-1
		for (i = 0; i < p; i++)
		{
			for (j = 0; j < r; j++)
			{
				c[i][j] = 0;
				for (k = 0; k < q; k++) 
					c[i][j] += a[i][k] * b[k][j];
			}
		}
	}
	
	public void show()
	{
		for (int i = 0; i < p; i++)
		{
			for (int j = 0; j < r; j++)
				System.out.print(c[i][j] + " ");
			System.out.println();
		}
	}
	
}

class MatTest
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int p, q, r, s;
		System.out.print("Enter the order of first matrix: ");
		p = sc.nextInt();
		q = sc.nextInt();
		
		System.out.print("Enter the order of second matrix: ");
		s = sc.nextInt();
		r = sc.nextInt();
		
		if (q != s)
		{
			System.out.println("Incompatible Orders");
			System.exit(0);
		}
		
		matTools mat = new matTools(p, q, r);
		mat.init();
		mat.multiply();
		System.out.println("The product matrix is:");
		mat.show();
	}
}