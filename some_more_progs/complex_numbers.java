// Add two integer complex numbers of the form (a + ib)

import java.util.*;

class complex
{
	private int re, im;
	
	public complex() // initialize the complex number (0 + i0)
	{
		re = im = 0;
	}
	
	public complex(int re, int im) // initialize the complex number (re + i*im)
	{
		this.re = re;
		this.im = im;
	}
	
	public complex(complex z) // create a shallow copy of the complex number object
	{
		this.re = z.re;
		this.im = z.im;
	}
	
	public complex add(complex num) // add two complex numbers and return the sum
	{
		/* 
		This function:
		* takes one parameter as a complex number object (num)
		* the other parameter is object on which the function is called (this object)
		* returns another complex number object which is the sum of the above two complex numbers
		*/
		
		// initialize an empty sum object to be returned
		complex sum = new complex();
		// perform the addition
		sum.re = this.re + num.re;
		sum.im = this.im + num.im;
		
		return sum;
	}
	
	public complex mul(complex num) // multiply the complex numbers
	{
		complex prod = new complex();
		prod.re = (this.re * num.re) - (this.im * num.im);
		prod.im = (this.re * num.im) + (this.im * num.re); 
		return prod;
	}
	
	public String display() // display the called complex number
	{
		return (re + " + i" + im);
	}
}

class ComplexNumbers
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter the real and imaginary parts of number 1: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		complex c1 = new complex(a, b);
		System.out.println("The number is " + c1.display());
		
		System.out.print("\nDo you want the the mathematical operations to be performed with \n1. This number, or \n2. Another complex number? \nEnter choice: ");
		int ch = sc.nextInt();
		complex c2;
		
		if (ch == 1) 
			c2 = new complex(c1); // create a shallow copy of c1
		else
		{
			System.out.print("\nEnter the real and imaginary parts of number 2: ");
			a = sc.nextInt();
			b = sc.nextInt();
			c2 = new complex(a, b);
			System.out.println("The number is " + c2.display());
		}
		
		complex sum = c1.add(c2);
		complex prod = c1.mul(c2);
		System.out.println("\nSum = " + sum.display() + "\nProduct = " + prod.display());
	}
}