import java.util.*;

class tools
{
	void doIt()
	{		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int n = sc.nextInt();

		int p, c, m, tot, mp;
		for(int i = 0; i < n; i++)
		{
			System.out.println("\nEnter marks of student " + (i+1) + ":");
			System.out.print("Enter marks in Physics: ");
			p = sc.nextInt();
			System.out.print("Enter marks in Chemistry: ");
			c = sc.nextInt();
			System.out.print("Enter marks in Mathematics: ");
			m = sc.nextInt();
			
			tot = p + c + m;
			mp = m + p;
			
			if(mp >= 150 || (m >= 60 && p >= 50 && c >= 40 && tot >= 200))
				System.out.println("Eligible");
			else
				System.out.println("Not eligible");
		}
	}
}

class Scores2
{
	public static void main(String args[])
	{
		tools obj = new tools();
		obj.doIt();
	}
}