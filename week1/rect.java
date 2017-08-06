// area and perimeter of a rectangle
import java.util.*;

class Rect 
{
	public static void main(String args[])
	{
		int l, b, area, per;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter length and breadth: ");
		l = sc.nextInt();
		b = sc.nextInt();
		
		area = l * b;
		per = 2*(l + b);
		
		System.out.println("Area = " + area + " sq units\nPerimeter = " + per + " units");		
		
	}
}