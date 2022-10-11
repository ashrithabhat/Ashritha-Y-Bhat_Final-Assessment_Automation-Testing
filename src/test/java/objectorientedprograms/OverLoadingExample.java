//Example of simple calculator using method overloading

package objectorientedprograms;

public class OverLoadingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverLoadingExample obj = new OverLoadingExample();
		obj.simpleCalculator(10,20);// Calling method
		obj.simpleCalculator(20.5f,10.5f);
		obj.simpleCalculator(2,4,3);
		obj.simpleCalculator(20d, 10d);
		
	}
	
	// Having same method name by passing different parameters
	void simpleCalculator(int x,int y)
	{
		int sum = x + y;
		System.out.println("Addition of two numbers = " + sum);
	}
	void simpleCalculator(float x,float y)
	{
		float difference = x - y;
		System.out.println("Subtraction of two numbers = " + difference);
	}
	void simpleCalculator(int x,int y,int z)
	{
		int multi = x * y * z;
		System.out.println("Multiplication of three numbers = " + multi);
	}
	void simpleCalculator(double x, double y)
	{
		double divide = x / y;
		System.out.println("Division of three numbers = " + divide);
	}

}
