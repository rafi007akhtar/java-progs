import java.util.*;

interface Department
{
	String deptName = "CSE", deptHead = "SKG";
	void showData();
}

class Hostel
{
	private String hostelName, hostelLocation;
	private int numberOfRooms;
	
	public void getData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter hostel name: ");
		hostelName = sc.nextLine();
		System.out.print("Enter hostel location: ");
		hostelLocation = sc.nextLine();
		System.out.print("Enter number of rooms: ");
		numberOfRooms = sc.nextInt();
	}
	
	public void showData()
	{
		System.out.println("Hostel name: " + hostelName + "\nHostel Location: " + hostelLocation);
		System.out.println("Number of rooms: " + numberOfRooms);
	}
}

class Student extends Hostel implements Department
{
	private String studentName, electiveSubject;
	private int regnNo, avgMarks;
	
	public void getData()
	{
		super.getData();
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter student name: ");
		studentName = sc.nextLine();
		System.out.print("Enter elective subject: ");
		electiveSubject = sc.nextLine();
		System.out.print("Enter student registration number: ");
		regnNo = sc.nextInt();
		System.out.print("Enter student average marks: ");
		avgMarks = sc.nextInt();
	}
	
	public void printData()
	{
		System.out.println("Department name: " + deptName + "\nDepartment Head: " + deptHead);
		showData();
		System.out.println("Student name: " + studentName + "\nElective Subject: " + electiveSubject);
		System.out.println("Registration number: " + regnNo);
	}
}

class StudentTest
{
	public static void main(String args[])
	{
		Student stud = new Student();
		stud.getData();
		System.out.println();
		stud.printData();
	}
}