import java.util.*;

class tools
{
	private int a[][], b[][], sum[][], row, col;
	
	public tools(int row, int col) // assign the instance variables for rows and columns and allocate the matrices
	{
		this.row = row;
		this.col = col;
		a = new int[row][col];
		b = new int[row][col];
		sum = new int[row][col];
	}
	
	public void init() // assign the given matrices
	{		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter " + (row*col) + " elements for the first matrix:");
		for (int i = 0; i < row; i++)
		{
			for (int j = 0; j < col; j++)
				a[i][j] = sc.nextInt();
		}
		
		System.out.println("Enter " + (row*col) + " elements for the first matrix:");
		for (int i = 0; i < row; i++)
		{
			for (int j = 0; j < col; j++)
				b[i][j] = sc.nextInt();
		}
	}
	
	public void add() // add the two matrices
	{		
		// perform the addition
		for (int i = 0; i < row; i++)
		{
			for (int j = 0; j < col; j++)
				sum[i][j] = a[i][j] + b[i][j];
		}
	}
	
	public void print() // print the sum matrix
	{
		for (int i = 0; i < row; i++)
		{
			for (int j = 0; j < col; j++)
				System.out.print(sum[i][j] + "\t");
			System.out.println();
		}
	}
}

class MatAdd
{
	public static void main(String args[])
	{
		int r, c;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows and columns of the matrices: ");
		r = sc.nextInt();
		c = sc.nextInt();
		
		tools mat = new tools(r, c);
		mat.init();
		mat.add();
		System.out.println("The added matrix is:");
		mat.print();
	}
}