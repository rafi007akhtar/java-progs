import java.util.Scanner;

interface It
{
	int a = 0, b = 0;
	int add();
	int sub();
}

class CI implements It
{
	private int a, b;
	public CI(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	
	public int add() { return a + b; }
	
	public int sub() { return b - a; }
}

class CItest
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		CI ci = new CI(a, b);
		System.out.println("Sum = " + ci.add() + "\nDifference = " + ci.sub());
	}
}