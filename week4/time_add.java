import java.util.*;

class timeTools
{
	private int h, min, sec;
	
	public timeTools()
	{
		h = min = sec = 0;
	}
	
	public timeTools(int h, int min, int sec)
	{
		this.h = h;
		this.min = min;
		this.sec = sec;
	}
	
	public timeTools add(timeTools time)
	{
		int s, m, hours;
		s = this.sec + time.sec;
		m = this.min + time.min;
		hours = this.h + time.h;
		
		timeTools sum = new timeTools();
		
		sum.sec = s%60;
		m += (s/60);
		sum.min = m%60;
		sum.h = hours + m/60;		
		
		return sum;
	}
	
	public String display()
	{
		return this.h + " : " + this.min + " : " + this.sec;
	}
}

class Time
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter hours, minutes and seconds of the first time: ");
		int h = sc.nextInt();
		int min = sc.nextInt();
		int sec = sc.nextInt();
		timeTools time1 = new timeTools(h, min, sec);
		System.out.println("The time is " + time1.display());
		
		System.out.print("Enter hours, minutes and seconds of the second time: ");
		h = sc.nextInt();
		min = sc.nextInt();
		sec = sc.nextInt();
		timeTools time2 = new timeTools(h, min, sec);
		System.out.println("The time is " + time2.display());
		
		timeTools time3 = new timeTools();
		time3 = time1.add(time2);
		System.out.println("Sum of times: " + time3.display());
		
	}
}