//Example for abstract class.

package objectorientedprograms;

abstract class Vehicle
{
	abstract void car();
	void bike()
	{
		System.out.println("Bikes are 2 wheeler");
	}
}
public class AbstractExample extends Vehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractExample obj = new AbstractExample();
		obj.car();
		obj.bike();
	}
	void car()
	{
		System.out.println("Cars are 4 wheeler");
	}
}
