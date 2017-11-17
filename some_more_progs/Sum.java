// Sample program to practise packages and some exception handling

package MyPack;

public class Sum
{
	public static void main(String args[])
	{
		try 
		{
			int a = Integer.valueOf(args[0]);
			int b = Integer.valueOf(args[1]);
			System.out.println(a + " + " + b + " = " + (a+b));
		}
		catch (Exception e)
		{
			System.out.println("Error: Two integer numbers expected in the command line");
		}
		finally 
		{
			System.out.println("The program has now terminated");
		}
	}
}