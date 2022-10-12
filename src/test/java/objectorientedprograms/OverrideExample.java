//Example of method overriding

package objectorientedprograms;

class Bank
{
	void rateOfInterest()
	{
		System.out.println("All banks will have rate of interest");
	}
}
class Sbi extends Bank
{
	void sbiRateOfInterest()
	{
		super.rateOfInterest();
		System.out.println("SBI is having 8 percent of interest for savings account");
	}
}
class Axis extends Sbi
{
	void axisRateOfInterest()
	{
		System.out.println("AXIS is having 6 percent of interest for savings account");
	}
}
public class OverrideExample extends Axis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverrideExample bank = new OverrideExample();
		bank.sbiRateOfInterest();
		bank.axisRateOfInterest();
	}
	
	// Overriding methods
	void sbiRateOfInterest()
	{
		super.sbiRateOfInterest();
		System.out.println("SBI is having 10 percent intreset for student account");
	}
	void axisRateOfInterest()
	{
		super.axisRateOfInterest();
		System.out.println("AXIS is having 8 percent intreset for student account");
	}

}
