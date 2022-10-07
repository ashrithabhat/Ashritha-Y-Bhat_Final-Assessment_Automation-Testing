//Example of Private and default access modifier

package objectorientedprograms;

class Addition
{
	//It's range is within this class only as it is declared as private keyword
	private int a = 20;
	private int b = 10;
	
	//By using static keyword it will remain common throughout the program
	static int x = 100;
	static int y = 200;
	
	//It cannot accessible by main function as it is private access modifier which is only accessible within the particular class.
	@SuppressWarnings("unused")
	private void add()
	{
		System.out.println("Addition of two numbers = " + (a+b));
	}
	//It is accessible in main function as it is default access modifier which can be accessible within the package.
	void sub()
	{
		System.out.println("Subtraction of two numbers = " + (a-b));
	}
}

public class AccessModifierExample extends Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifierExample acc = new AccessModifierExample();
		acc.sub();
		System.out.println("Value of x = " + x + " and value of y = " + y);
	}
}
