package exp;

class NoMatchException extends Exception
{
	private String name;
	
	NoMatchException(String name)
	{
		this.name = name;
	}
	
	// override toString()
	public String toString()
	{
		return "Invalid university";
	}
}

public class prog1
{
	static void check(String name) throws NoMatchException
	{
		if (!name.equals("University")) throw new NoMatchException(name);
			System.out.println("Correct input");
	}
	public static void main(String args[]) 
	{
		try { check(args[0]); }
		catch (NoMatchException e) { System.out.println(e); }
	}
}