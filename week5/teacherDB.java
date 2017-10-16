import java.util.*;

class Staff
{
	String name;
	int code;
	
	public Staff() // default code, name
	{
		code = (int) Math.random()*10;
		name = "NA";
	}
	
	public Staff(int code, String name) // parameterized code, name
	{
		this.code = code;
		this.name = name;
	}
	
	public Staff(Staff staff) // create a shallow copy
	{
		staff.code = this.code; 
		staff.name = this.name;
	}
}

class Teacher extends Staff
{
	String subject, publication;
	
	public Teacher() // default subject, publication
	{
		subject = publication = "NA";
	}
	
	public Teacher(String subject, String publication) // parameterized subject, publication
	{
		this.subject = subject;
		this.publication = publication;
	}
	
	public Teacher(Teacher teacher) // create a shallow copy
	{
		teacher.subject = this.subject; 
		teacher.publication = this.publication;
	}
}

class Officer extends Staff
{
	String grade;
	
	public Officer() // default grade
	{
		grade = "NA";
	}
	
	public Officer(String grade) // parameterized grade
	{
		this.grade = grade;
	}
	
	public Officer(Officer officer) // create a shallow copy
	{
		officer.grade = this.grade; 
	}
}

class Typist extends Staff
{
	int speed;
	
	public Typist() // default speed
	{
		speed = 0;
	}
	
	public Typist(int speed) // parameterized speed
	{
		this.speed = speed;
	}
	
	public Typist(Typist typist) // create a shallow copy
	{
		typist.speed = this.speed; 
	}
}

class RegularTypist extends Typist
{
	int remuneration;
	
	public RegularTypist() // default remuneration
	{
		remuneration = 0;
	}
	
	public RegularTypist(int remuneration) // parameterized remuneration
	{
		this.remuneration = remuneration;
	}
	
	public RegularTypist(RegularTypist regularTypist) // create a shallow copy
	{
		regularTypist.remuneration = this.remuneration; 
	}
}

class CasualTypist extends Typist
{
	int wage;
	
	public CasualTypist() // default wage
	{
		wage = 0;
	}
	
	public CasualTypist(int wage) // parameterized wage
	{
		this.wage = wage;
	}
	
	public CasualTypist(CasualTypist casualTypist) // create a shallow copy
	{
		casualTypist.wage = this.wage; 
	}
}

class StaffTest
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of staff: ");
		int n = sc.nextInt();
		Staff staff[] = new Staff[n];
		
		for (int i = 0; i < n; i++)
		{
			System.out.print("Enter name of staff with code " + (i+1) + ": ");
			String name = sc.nextLine();
			staff[i] = new Staff(i, name);
			
			//System.out.print("Is this ")
		}
	}
}