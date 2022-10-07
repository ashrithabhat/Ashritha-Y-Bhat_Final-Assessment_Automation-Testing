// Vector collection example

package collections;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declaring the Vector
        Vector<Integer> vec = new Vector<Integer>();
  
        // Appending new elements at the end of the list.
        for (int i = 11; i <= 15; i++)
            vec.add(i);
  
        // Printing elements in list
        System.out.println(vec);
  
        //Remove element at index 3
        vec.remove(2);
  
        // Displaying the Vector after deletion in list
        System.out.println(vec);
  
        // Printing elements one by one not in list
        for (int i = 0; i < vec.size(); i++)
            System.out.print(vec.get(i) + "\n");
	}
}
