package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Problem1 {

	public static void main(String[] args) {
		
		// iterate hashmap
		
		HashMap hm = new HashMap();
		
		hm.put(1, 10);
		hm.put(2, 20);
		hm.put(3, 30);
		hm.put(4, 40);
		hm.put(5, 50);
		hm.put(6, 60);
		System.out.println(hm);
		
		
		Iterator i=hm.entrySet().iterator();
		
		while (i.hasNext()) {
			System.out.println(i.next());
			
		}
		
		

	}

}
