import java.util.*;

class stacks
{
	private int stack[], top, size;
	
	public stacks(int size) // initialize instance variables
	{
		top = -1;
		this.size = size;
		stack = new int[size];
	}
	
	public int push(int val)
	{
		if (top == size-1) // check for stack overflow
			return -1;
		stack[++top] = val; // add value and update top
		return top;
	}
		
	public int pop()
	{
		if (top == -1) return -1; // check for stack underflow
			
		int del = stack[top];
		stack[top--] = -1;
		return del;
	}
	
	public int peep()
	{
		if (top == -1) return -1; // in case the stack is empty
		return stack[top];
	}
	
	public void display()
	{
		if (top == -1) // in case the stack is empty
			System.out.println("Error. Stack empty.");
		else 
		{	
			System.out.println("The stack is:");
			for (int i = top; i >= 0; i--)
				System.out.println(stack[i]);
		}
	}
	
}

class Stacking
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the stack: ");
		int size = sc.nextInt();
		
		stacks stk = new stacks(size);
		int ch, val;
		while(true)
		{
			System.out.print("\nMenu\n----\n1. Push \n2. Pop \n3. Peep \n4. Display the stack \n-1. Exit \nYour choice: ");
			ch = sc.nextInt();
			if (ch == -1) break;
			switch (ch)
			{
				case 1:
					System.out.print("Enter value to push: ");
					val = sc.nextInt();
					val = stk.push(val);
					if (val == -1) System.out.println("Push failed. Stack overflow");
					else System.out.println("Push successful");
					break;
					
				case 2:
					val = stk.pop();
					if (val == -1) System.out.println("Pop failed. Stack underflow");
					else System.out.println("Value popped = " + val);
					break;
				
				case 3:
					val = stk.peep();
					if (val == -1) System.out.println("Peep failed. Stack empty");
					else System.out.println("Value at top = " + val);
					break;
				
				case 4:
					stk.display();
					break;
				
				default:
					System.out.println("Wrong choice. Try again");
			}
		}
	}
}