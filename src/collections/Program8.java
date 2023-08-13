package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Program8 {

	public static void main(String[] args) {
		// reverse the arraylist
		
		ArrayList al = new ArrayList();
		
		
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);
		
		System.out.println(al);
		Collections.reverse(al);
		System.out.println(al);
		
	}

}
