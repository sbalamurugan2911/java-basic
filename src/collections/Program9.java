package collections;

import java.util.Iterator;
import java.util.TreeMap;

public class Program9 {

	public static void main(String[] args) {
		// iterate treemap
		
		TreeMap t = new TreeMap();
		
		t.put(1, 10);
		t.put(3, 25);
		t.put(5, 53);
		t.put(8, 31);
		t.put(2, 75);
		
		Iterator i=t.entrySet().iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		

	}

}
