package exp;

import java.util.*;

class NoMatchFoundException extends Exception
{
	private String country;
	
	NoMatchFoundException(String country) { this.country = country; }
	
	public String toString()
	{
		return "Capital not found";
	}
}

class prog3
{
	static void printCap(String country) throws NoMatchFoundException
	{
		if (!country.equals("India")) 
			throw new NoMatchFoundException(country);
		
		System.out.println("Capital: New Delhi");
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter country: ");
		String country = sc.nextLine();
		
		try { printCap(country); }
		catch (NoMatchFoundException e) { System.out.println(e); }
	}
}