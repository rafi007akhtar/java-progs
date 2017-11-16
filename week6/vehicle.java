import java.util.*;

class Vehicle
{
	protected int regnNumber, speed;
	protected String ownerName, color;
	
	public Vehicle() // default constructor
	{
		regnNumber = speed = 0;
		color = "White"; // default color
		ownerName = "Anonymous";
	}
	
	public Vehicle(int regnNumber, int speed, String color, String ownerName) // parameterized constructor
	{
		this.regnNumber = regnNumber;
		this.speed = speed;
		this.ownerName = ownerName;
		this.color = color;
	}
	
	public Vehicle(Vehicle vehicle) // copy constructor - create a shallow copy
	{
		vehicle.regnNumber = this.regnNumber;
		vehicle.speed = this.speed;
		vehicle.ownerName = this.ownerName;
		vehicle.color = this.color;
	}
	
	public void showData()
	{
		System.out.println("This is a vehicle class");
	}
	
}

class Bus extends Vehicle
{
	private int routeNumber;
	
	public Bus() // default constructor
	{
		super();
		routeNumber = 1;  // default routeNumber
	}
	
	public Bus(int regnNumber, int speed, String color, String ownerName, int routeNumber) // parameterized constructor
	{
		super(regnNumber, speed, color, ownerName);
		this.routeNumber = routeNumber;
	}
	
	public Bus(Bus bus) // copy constructor - create a shallow copy
	{
		bus.regnNumber = this.regnNumber;
		bus.speed = this.speed;
		bus.color = this.color;
		bus.ownerName = this.ownerName;
		bus.routeNumber = this.routeNumber;
	}
	
	public void showData()
	{
		System.out.println("Registration number: " + regnNumber + "\nSpeed = " + speed + "units \nOwner name = " + ownerName + "\nRoute number = " + routeNumber + "\n");
		super.showData();
	}
	
}

class Car extends Vehicle
{
	private String manufactureName;
	
	public Car() // default constructor
	{
		super();
		manufactureName = "NA";  // default manufactureName
	}
	
	public Car(int regnNumber, int speed, String color, String ownerName, String manufactureName) // parameterized constructor
	{
		super(regnNumber, speed, color, ownerName);
		this.manufactureName = manufactureName;
	}
	
	public Car(Car car) // copy constructor - create a shallow copy
	{
		car.regnNumber = this.regnNumber;
		car.speed = this.speed;
		car.color = this.color;
		car.ownerName = this.ownerName;
		car.manufactureName = this.manufactureName;
	}
	
	public void showData()
	{
		System.out.println("Registration number: " + regnNumber + "\nSpeed = " + speed + "units \nOwner name = " + ownerName + "\nManufacture name = " + manufactureName + "\n");
		super.showData();
	}
	
}

class VehicleTest
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Vehicle bus, car;
		
		int regnNumber, speed;
		String color, ownerName;
		
		System.out.println("Enter details of the vehicle:");
		System.out.print("Registration number: ");
		regnNumber = sc.nextInt();
		System.out.print("Speed (in kmph): ");
		speed = sc.nextInt();
		System.out.print("Color: ");
		color = sc.next();
		System.out.print("Owner name: ");
		ownerName = sc.next();
		
		System.out.print("\nEnter 1 for bus, or 2 for car: ");
		String flush = sc.nextLine();
		int ch = sc.nextInt();
		
		switch(ch)
		{
			case 1:
				System.out.print("Enter route number of the bus: ");
				int routeNumber = sc.nextInt();
				bus = new Bus(regnNumber, speed, color, ownerName, routeNumber);
				bus.showData();
				break;
			
			case 2:
				System.out.print("Enter manufacture name of the car: ");
				String manufactureName = sc.next();
				car = new Car(regnNumber, speed, color, ownerName, manufactureName);
				car.showData();
				break;
			
			default: System.out.println("Wrong choice. Program is terminating");
		}
		
	}
}