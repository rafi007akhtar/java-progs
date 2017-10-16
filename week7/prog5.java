import java.util.*;

class tools
{
	String s;
	int l;
	
	public tools() 
	{ 
		s = ""; 
		l = 0;
	}
	public tools(String s) 
	{ 
		this.s = s; 
		l = s.length();
	}
	public tools(tools tool) { 
		tool.s = this.s; 
		tool.l = this.l;
	}
	
	public int countUpper()
	{
		int c = 0;
		for (int i = 0; i < l; i++)
		{
			int ch = s.charAt(i);
			if (ch >= 65 && ch <= 91) c++;
		}
		return c;
	}
	
	public int countLower()
	{
		int c = 0;
		for (int i = 0; i < l; i++)
		{
			int ch = s.charAt(i);
			if (ch >= 97 && ch <= 122) c++;
		}
		return c;
	}
	
	public int countDigits()
	{
		int c = 0;
		for (int i = 0; i < l; i++)
		{
			int ch = s.charAt(i);
			if (ch >= 48 && ch <= 57) c++;
		}
		return c;
	}
	
	public int countSpaces()
	{
		int c = 0;
		for (int i = 0; i < l; i++)
		{
			int ch = s.charAt(i);
			if (ch == 32) c++;
		}
		return c;
	}
}

class StringOps
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the string: ");
		String s = sc.nextLine();
		
		tools tool = new tools(s);
		System.out.println("Number of uppercase characters = " + tool.countUpper()
		+ "\nNumber of lowercase characters = " + tool.countLower()
		+ "\nNumber of digits = " + tool.countDigits()
		+ "\nNumber of spaces = " + tool.countSpaces());
	}
}