//Example of simple calculator using Interface concept

package objectorientedprograms;

// Interface class contains only abstract method
interface add
{
	void addition();// Abstract method which contains no defination
}

interface sub
{
	void subtraction();
}

interface multiply
{
	void multiplication();
}

interface divide
{
	void division();
}

public class InterfaceExample implements add,sub,multiply,divide{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceExample obj = new InterfaceExample();
		obj.addition();
		obj.subtraction();
		obj.multiplication();
		obj.division();
	}
	
	// Providing defination for abstract method
	public void addition()
	{
		int x=10;
		int y=20;
		System.out.println("Addition of two numbers = " + (x+y));
		
	}
	public void subtraction()
	{
		int x=20;
		int y=10;
		System.out.println("Subtraction of two numbers = " + (x-y));
	}
	public void multiplication()
	{
		int x=20;
		int y=10;
		System.out.println("Multiplication of two numbers = " + (x*y));
	}
	public void division()
	{
		int x=20;
		int y=10;
		System.out.println("Division of two numbers = " + (x/y));
	}
}
