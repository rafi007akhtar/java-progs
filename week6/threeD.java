import java.util.*;

class ThreeDObject
{
	private float dim1, dim2, dim3; // dimensions
	
	ThreeDObject() { dim1 = dim2 = dim3 = 0; } // non parameterized constructor
	
	ThreeDObject(float dim1, float dim2, float dim3) // parameterized constructor
	{
		this.dim1 = dim1;
		this.dim2 = dim2;
		this.dim3 = dim3;
	}
	
	float wholeSurfaceArea()
	{
		return dim1*dim2 + dim2*dim3 + dim3*dim1;
	}
	
	float volume()
	{
		return dim1*dim2*dim3;
	}
}

class Box extends ThreeDObject
{
	private float width, height, length;
	
	Box() { width = height = length = 0; } // non parameterized constructor
	
	Box(float width, float height, float length) // parameterized constructor
	{
		this.width = width;
		this.length = length;
		this.height = height;
	}
	
	float wholeSurfaceArea()
	{
		return 2*(width*height + height*length + length*width);
	}
	
	float volume()
	{
		return width*height*length;
	}
}

class Cube extends ThreeDObject
{
	private float side;
	
	Cube() { side = 0; } // non parameterized constructor
	
	Cube(float side) { this.side = side; } // parameterized constructor 
	
	float wholeSurfaceArea()
	{
		return side*side;
	}
	
	float volume()
	{
		return side*side*side;
	}
}

class Cylinder extends ThreeDObject
{
	private float r, l;
	
	Cylinder() { r = l = 0; } // non parameterized constructor
	
	Cylinder(float r, float l) // parameterized constructor
	{
		this.r = r;
		this.l = l;
	}
	
	float wholeSurfaceArea()
	{
		return (float)(2 * (22.0/7.0) * r * l);
	}
	
	float volume()
	{
		return (float) (22.0/7.0) * r*r*l;
	}
}

class Test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		ThreeDObject ob = new ThreeDObject();
		
		System.out.print("Enter the type of 3D object:\n1. Box \n2. Cube \n3. Cylinder \n4. Others \n-1 Exit \nYour choice: ");
		int ch = sc.nextInt();
		
		if (ch == -1) System.exit(0);
		
		switch(ch)
		{
			case 1: // Box
				int w, h, l;
				System.out.print("Enter width, height and length of the box: ");
				w = sc.nextInt();
				h = sc.nextInt();
				l = sc.nextInt();
				
				ob = new Box(w,h,l);
				break;
				
			case 2:  // Cube
				int a;
				System.out.print("Enter the side of the cube: ");
				a = sc.nextInt();
				
				ob = new Cube(a);
				break;
			
			case 3: // Cylinder
				int r, len;
				System.out.print("Enter radius and length of the cylinder: ");
				r = sc.nextInt();
				len = sc.nextInt();
				
				ob = new Cylinder(r, len);
				break;
			
			case 4: // 3D Object
				int dim1, dim2, dim3;
				System.out.print("Enter the 3 dimensions of the object: ");
				dim1 = sc.nextInt();
				dim2 = sc.nextInt();
				dim3 = sc.nextInt();
				
				ob = new ThreeDObject(dim1, dim2, dim3);
				break;
			
			default: // Wrong choice
				System.out.println("Wrong choice. Try again\n");
				main(args);
				System.exit(1);
		}
		
		// calculate the surface area and volume
		float area, vol;
		area = ob.wholeSurfaceArea(); // overriding happens as it is supposed to be
		vol = ob.volume(); // overriding happens as it is supposed to be
		
		System.out.println("Whole surface area = " + area + " sq. units \nVolume = " + vol + " cubic units");
	}
}