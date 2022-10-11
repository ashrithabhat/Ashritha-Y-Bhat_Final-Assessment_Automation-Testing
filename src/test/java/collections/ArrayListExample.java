// Array List collection example.
// Main disadvantage of Array List is that we can add values in between it will always add values at the end.
// To add elements in between we have linked list collection.

package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ArrayListExample {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collection values = new ArrayList(); // Creating object.
		
		// Adding values to the list
		values.add("Ashritha");
		values.add(16);
		values.add(2001);
		Iterator i= values.iterator();
		System.out.println("Fetching values from Array List using Iteraror");
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		values.remove(2001);//Value 2001 is removed from list
		System.out.println("\nFetching values from Array List using Enhanced for loop");
		for(Object i1 : values)
		{
			System.out.println(i1);

		}
		values.add("Bhat");//Value Bhat is added to the list
		System.out.println("\nFetching values from Array List using Enhanced for loop");
		for(Object i1 : values)
		{
			System.out.println(i1);
		}
	}
}
