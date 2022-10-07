//Example for public access modifier

package objectorientedprograms;

public class PublicExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PublicExample1 obj = new PublicExample1();
		int total = obj.subtract(50, 30);
		System.out.println("Difference of two numbers = " + total);
	}
	
	//Public access modifier can be accessible by other packages also.
	//In this this method is accessed by accessmodifierexample package
	public int add(int x, int y)
	{
		int sum = x + y;
		return sum;
	}
	
	//default access modifier which cannot be accessed by other packages
	int subtract(int x, int y)
	{
		int dif = x - y;
		return dif;
	}
}
