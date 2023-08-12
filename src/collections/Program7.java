package collections;

import java.util.HashSet;

public class Program7 {

	public static void main(String[] args) {
		// convert HashSet to Array
		
		HashSet  hs = new HashSet();
		
		hs.add("name");
		hs.add("age");
		hs.add("place");
		hs.add("qualification");
		hs.add("experience");
		
		System.out.println(hs);
		
		Object [] arr=hs.toArray();
		for(Object a : arr) {
			System.out.println(a);
		}

	}

}
