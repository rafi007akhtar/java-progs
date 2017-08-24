import java.util.*;

class Arm
{
	private int n, dig;
	
	public Arm(int n)
	{
		this.n = n;
		
		int m = n, dig = 0;
		while(m > 0)
		{
			m /= 10;
			dig++;
		}
		this.dig = dig;
	}
	
	public void check() // check if n is an Armstrong number
	{
		int sum = 0, temp = n;
		do
		{
			int rem = temp % 10;
			sum += Math.pow(rem, dig);
			temp /= 10;
		}while(temp != 0);
		
		System.out.println("It is " + (n == sum) + " that " + n + " is an Armstrong number");
	}
	
}

class Armstrong
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		// input numbers
		System.out.print("Enter two numbers: ");
		int n = sc.nextInt();
		int m = sc.nextInt();
		// create objects
		Arm a1 = new Arm(n);
		Arm a2 = new Arm(m);
		// call functions
		a1.check();
		a2.check();
	}
}