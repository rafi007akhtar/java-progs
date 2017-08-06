// area and perimeter of a circle
import java.util.*;

class Circle 
{
	public static void main(String args[])
	{
		int r;
		float area, per;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the radius: ");
		r = sc.nextInt();
		
		float pi = (float)(22.0/7.0);
		area = (float)(pi * r * r);
		per = (float)(2*pi*r);
		
		System.out.println("Area = " + area + " sq units\nPerimeter = " + per + " units");		
		
	}
}