import java.util.*;

class Marks
{
	public void write(int a[], int l)
	{
		for(int i = 0; i < l; i++)
			System.out.println(a[i]);
	}
	
	public static void main(String args[])
	{
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of students: ");
		n = sc.nextInt();
		
		int range1[] = new int[n];
		int range2[] = new int[n];
		int range3[] = new int[n];
		int range4[] = new int[n];
		
		int a,b,c,d,i,temp;
		a = b = c = d = 0;
		System.out.println("Enter the marks of students: ");
		for(i = 0; i < n; i++)
		{
			temp = sc.nextInt();
			if(temp >= 81 && temp <= 100)
				range1[a++] = temp;
			else if(temp >= 61 && temp <= 80)
				range2[b++] = temp;
			else if(temp >= 41 && temp <= 60)
				range3[c++] = temp;
			else
				range4[d++] = temp;
		}
		
		Marks ob = new Marks();
		
		System.out.println("Range 81 to 100:");
		ob.write(range1, a);
		
		System.out.println("\nRange 61 to 80:");
		ob.write(range2, b);
		
		System.out.println("\nRange 41 to 60:");
		ob.write(range3, c);
		
		System.out.println("\nRange 40 to 0:");
		ob.write(range4, d);
	}
}