// Not a self-written program; borrowed from elsewhere
import java.util.*;
 class Staff
 {
	protected int code;
	protected String name;
	Staff(int c, String n)
	{
		code=c;
		name=n;
	}
	void display()
	{
	 System.out.println("Code= "+code);
	 System.out.println("Name is "+name);
	}
}
	
	class Teacher extends Staff
	{
		private String subject;
		private int publication;
		Teacher(int c, String n, String s, int p)
		{
			super(c,n);
			subject=s;
			publication=p;
		}
		void display()
		{
			super.display();
			System.out.println("Subject of Teacher= " +subject);
			
			System.out.println("Publications of Teacher " +publication);
		}
	}
	
	class Officer extends Staff
	{
		private char grade;
		Officer(int c, String n, char g)
		{
			super(c,n);
			grade=g;
		}
		void display()
		{
			super.display();
			System.out.println("Grade of Officer=" +grade);
		}
	}
	
	class Typist extends Staff
	{
		protected int speed;
		Typist(int c, String n, int s)
		{
			super(c,n);
			speed=s;
		}
		void display()
		{
			super.display();
			System.out.println("Speed of Typist="+speed);
		}
	}
	
	class RegularTypist extends Typist
	{
		private int remuneration;
		RegularTypist(int c, String n, int s, int r)
		{
			super(c,n,s);
			remuneration= r;
		}
		void display()
		{
			super.display();
			System.out.println("Remuneration of Regular Typist=" +remuneration);
		}
	}
	
	class CasualTypist extends Typist
	{
		private int dailywages;
		CasualTypist(int c, String n, int s, int d)
		{
			super(c,n,s);
			dailywages=d;
		}
		void display()
		{
			super.display();
			System.out.println("Daily Wages of Casual Typist=" +dailywages);
		}
	}
	
	class Test
	{
		public static void main(String args[])
		{	
			int c,p;
			String n,s;
			Scanner sc= new Scanner(System.in);
			
			System.out.print("Enter teacher name: ");
			n = sc.nextLine();
			System.out.print("Enter teacher code: ");
			c = sc.nextInt();
			String flush = sc.nextLine(); // flush the i/p stream here
			System.out.print("Enter subject: ");
			s = sc.nextLine();
			System.out.print("Enter number of publications: ");
			p = sc.nextInt();

			System.out.println();
		
			/*c=10;
			p=1;
			n="ray";
			s="eng";*/
			
			Teacher ob= new Teacher(c,n,s,p);
			ob.display();
			System.out.println();
			
			System.out.println("Enter code, name, speed and daily wages of Reg. Typist");
			int c1=11;
			String n1="rup";
			int speed=70;
			int dw=100;
			CasualTypist ob1= new CasualTypist(c1,n1,speed,dw);
			ob1.display();
		}
	}