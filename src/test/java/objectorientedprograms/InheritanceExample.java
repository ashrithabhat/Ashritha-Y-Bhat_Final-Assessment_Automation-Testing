//Example of voting using inheritance concept

package objectorientedprograms;

// Voting1 class 
class Voting1
{
	void votingAge()
	{
		System.out.println("Age for voting is 18");
	}
}

// Voting2 class inherits the properties from Voting1 class
class Voting2 extends Voting1
{
	void voterId()
	{
		this.votingAge();// This keyword refers to the super class of voting2 class
		System.out.println("Voter must have voter ID for voting");
	}
}

// InheritanceExample class inherits the properties from Voting2 class
public class InheritanceExample extends Voting2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InheritanceExample obj = new InheritanceExample();
		obj.voterId();
	}
}
