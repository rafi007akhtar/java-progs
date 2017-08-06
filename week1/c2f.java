import java.util.*;

class C2F
{
	public static void main(String args[])
	{
		float cel, far;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the temperature in Celcius: ");
		cel = sc.nextFloat();
		
		far = (float)(((9.0 * cel)/5.0) + 32);
		System.out.println(cel + " degree C = " + far + " degree F");
		
	}
}