// Linked list collection example where we can add elements in between by specifying index value.

package collections;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating object of the class Linked list.
		LinkedList<String> link = new LinkedList<String>();
		
		//Adding elements to list
		link.add("Ashritha");
		link.add("Bhat");
		link.addFirst("Y");
		link.addLast("2001");
		link.add(3, "16");
		
		//To print list values
		System.out.println("Linked list elements are: \n");
		System.out.println(link);
		
		// To remove elements from list
		link.removeLast();
		link.removeFirst();
		link.remove(1);
		link.remove("16");
		
		System.out.println("Linked list values after removing are: \n");
		System.out.println(link);
	}
}
