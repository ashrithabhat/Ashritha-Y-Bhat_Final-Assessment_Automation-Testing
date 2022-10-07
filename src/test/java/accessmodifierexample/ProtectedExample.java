//Here we can access the method from other package as method is declared as protected only through inheritance.

package accessmodifierexample;

import objectorientedprograms.ProtectedExample1;

public class ProtectedExample extends ProtectedExample1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProtectedExample obj = new ProtectedExample();
		obj.averageAge();
	}

}
