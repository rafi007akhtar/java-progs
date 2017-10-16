class CountAndPrintArgs
{
	private String args[];
	public CountAndPrintArgs(String args[])
	{
		this.args = args;
	}
	
	void showData()
	{
		System.out.println("Number of words: " + args.length);
		for(String word: args) System.out.println(word.charAt(0));
	}
}

class Driver
{
	public static void main(String args[])
	{
		CountAndPrintArgs ob = new CountAndPrintArgs(args);
		ob.showData();
	}
}