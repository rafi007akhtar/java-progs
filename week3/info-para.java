import java.util.*;

class info
{
	private int roll;
	private String name;
	
	public info (String name, int roll) // constructor with parameters name and roll
	{
		this.name = name;
		this.roll = roll;
	}
	
	public void show()
	{
		System.out.println("\nUser: " + name + "\nRoll number: " + roll);
	}
}

class Information
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name: ");
		String name = sc.nextLine();
		System.out.print("Enter roll number: ");
		int roll = sc.nextInt();
		
		info ob = new info(name, roll);
		ob.show();
	}
}