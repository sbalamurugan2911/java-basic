package map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Problem3 {

	public static void main(String[] args) {
		// sort arraylist in descending order
		
		ArrayList al = new ArrayList ();
		
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		
		
		System.out.println(al);
		
		Collections.sort(al, Collections.reverseOrder());
		System.out.println(al);
		

	}

}
