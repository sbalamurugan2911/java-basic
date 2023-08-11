package map;

import java.util.HashMap;
import java.util.TreeMap;

public class Problem2 {

	public static void main(String[] args) {
		// sorting HashMap
		
		HashMap hm = new HashMap();
		
		hm.put(1, 10);
		hm.put(3, 20);
		hm.put(4, 30);
		hm.put(2, 40);
		hm.put(5, 50);
		
		TreeMap t =new TreeMap(hm);
		
		System.out.println(t);

	}

}
