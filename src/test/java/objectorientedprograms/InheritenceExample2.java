package objectorientedprograms;


class BankAccount
{
	int balance = 10000;
	void deposit()
	{
		int amount = 1000;
		System.out.println("Amount is deposited = " + amount);
	    balance = balance + amount;
	}
	void withdraw()
	{
		int amount = 500;
		if(amount>0 && amount<balance)
		{
			System.out.println(amount + " rupees is deposited");
		}
		balance = balance - amount;
	}
	void getBalance()
	{
		System.out.println(balance);
	}
}

// Class inheritenceExample inherits the properties from parent class
public class InheritenceExample2 extends BankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InheritenceExample2 obj = new InheritenceExample2();
		obj.deposit();//call deposit method
		obj.withdraw();//call withdraw method
		obj.getBalance();//call getBalance method
	}
}
