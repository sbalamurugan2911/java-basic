package collections;

import java.util.ArrayList;

public class Program4 {

	public static void main(String[] args) {
		// write program to add element at particular index in arraylist
		
		ArrayList al = new ArrayList();
		
		al.add(11);
		al.add(17);
		al.add(21);
		al.add(12);
		al.add(31);
		
		System.out.println(al);
		
		al.set(2, 17);
		
		System.out.println(al);
	}

}
