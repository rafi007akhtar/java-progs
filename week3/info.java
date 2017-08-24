class info
{
	private int roll;
	private String name;
	
	public info() // parameterless constructor
	{
		roll = 37;
		name = "Md Rafi Akhtar";
	}
	
	public void show()
	{
		System.out.println("User: " + name + "\nRoll number: " + roll);
	}
}

class Information
{
	public static void main(String args[])
	{
		info ob = new info();
		ob.show();
	}
}