package collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class Program6 {

	public static void main(String[] args) {
		// convert LinkedList to ArrayList
		
       LinkedList ll = new LinkedList ();
		
		ll.add(12);
		ll.add(25);
		ll.add(36);
		ll.add(42);
		ll.add(57);
		
		System.out.println("ArrayList");
		System.out.println(ll);
		
		ArrayList al = new ArrayList(ll);
		System.out.println("LinkedList");
		System.out.println(al);
		

	}

}
