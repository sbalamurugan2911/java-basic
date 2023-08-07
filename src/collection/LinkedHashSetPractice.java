package collection;

import java.util.LinkedHashSet;

public class LinkedHashSetPractice {
	
	public static void main (String []args) {

		LinkedHashSet lhs = new LinkedHashSet();
		
		lhs.add(10);
		lhs.add(12);
		lhs.add(12);
		lhs.add(14);
		lhs.add(16);
		lhs.add(18);
		lhs.add(20);
		lhs.add(null);
		System.out.println(lhs);
		
		// duplicate not allowed
		// insertion order maintained
		//null value allowed
		
		
	}

}
