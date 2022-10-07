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
public class OverrideExample extends Sbi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverrideExample bank = new OverrideExample();
		bank.sbiRateOfInterest();
	}
	void sbiRateOfInterest()
	{
		super.sbiRateOfInterest();
		System.out.println("SBI is having 10 percent intreset for student account");
	}

}
