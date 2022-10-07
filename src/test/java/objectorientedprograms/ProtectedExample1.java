//Example for protected access modifier, accessible through inheritance concept.

package objectorientedprograms;

class Age
{
	protected void averageAge()
	{
		System.out.println("Average age of a person is 80");
	}
}

public class ProtectedExample1 extends Age{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProtectedExample1 obj = new ProtectedExample1();
		obj.averageAge();
	}
}
