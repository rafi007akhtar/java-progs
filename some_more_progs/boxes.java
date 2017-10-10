import java.util.*;

class Box
{
	private int l, b, h;
	
	public Box (int l, int b, int h)
	{
		this.l = l;
		this.b = b;
		this.h = h;
	}
	public int volume()
	{
		return l * b * h;
	}
}

class BoxWeight extends Box
{
	private int weight;
	public BoxWeight (int x, int y, int z, int weight)
	{
		super(x,y,z);
		this.weight = weight;
	}
	
	public void display()
	{
		System.out.println("Weight of box = " + weight);
		System.out.println("Volume = " + volume());
	}
}

class BoxTest
{
	public static void main(String args[])
	{
		BoxWeight bx = new BoxWeight(10,20,30,1000);
		bx.display();
	}
}
