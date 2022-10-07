//Example for exception handling

package objectorientedprograms;

class Abc
{
	//throws keyword
	void m1() throws ArithmeticException
	{
		int a = 10/0;
		System.out.println("Value of a = " + a);
	}
}

public class ExceptionHandlingExample extends Abc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//try and catch block for handling exception in Class Abc
		ExceptionHandlingExample obj = new ExceptionHandlingExample();
		try
		{
			obj.m1();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception occured");
		}
		
		//try and catch block for below expression
		try
		{
			int x = 10/0;
			System.out.println("Value of x = " + x);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Throws exception");
		}
		
		//finally block will always execute
		finally 
		{  
			System.out.println("finally block is always executed");  
		} 
		
		
		//static method can be called directly it does not need any object to execute.
		validate(16);
	}
	
	//Throws keyword
	static void validate(int age)
	{
		if(age<18)
			throw new ArithmeticException("Not valid age for Driving License");
		else
			System.out.println("You can take the Driving License Application");	
	}
}
