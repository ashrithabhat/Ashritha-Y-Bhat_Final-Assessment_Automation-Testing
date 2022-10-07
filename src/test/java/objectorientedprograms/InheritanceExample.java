//Example of voting using inheritance concept

package objectorientedprograms;

class Voting1
{
	void votingAge()
	{
		System.out.println("Age for voting is 18");
	}
}
class Voting2 extends Voting1
{
	void voterId()
	{
		this.votingAge();
		System.out.println("Voter must have voter ID for voting");
	}
}

public class InheritanceExample extends Voting2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InheritanceExample obj = new InheritanceExample();
		obj.voterId();
	}
}
