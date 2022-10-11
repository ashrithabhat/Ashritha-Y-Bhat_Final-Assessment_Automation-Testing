//Example for abstract class.

package objectorientedprograms;

// Abstract class contains abstract method and other methods also
abstract class Vehicle
{
	// Abstract method which contains no defination.
	abstract void car();
	
	// bike method
	void bike()
	{
		System.out.println("Bikes are 2 wheeler");
	}
}

// Class abstract example inherits the properties of class Vehicle
public class AbstractExample extends Vehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractExample obj = new AbstractExample(); // Creating object
		obj.car();// Calling car method
		obj.bike();// Calling bike method
	}
	
	// Providing defination for abstract method
	void car()
	{
		System.out.println("Cars are 4 wheeler");
	}
}
