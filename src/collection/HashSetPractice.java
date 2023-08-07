package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetPractice {
	
	

	public static void main(String[] args) {
		
		HashSet<Integer> hs = new HashSet();
		
		hs.add(10);
		hs.add(12);
		hs.add(14);
		hs.add(16);
		hs.add(16);
		hs.add(20);
		hs.add(20);
		hs.add(24);
		hs.add(24);
		hs.add(null);
		System.out.println(hs);
		
		// duplicate not allowed
		// no insertion order maintain
		//null value allowed
		
		// to get each value use Iterator
       Iterator  i=hs.iterator();
       while(i.hasNext()) {
    	   System.out.print(i.next()+" ");
       }
      // if same generic use for each loop
       
       for(Integer l: hs) {
    	   System.out.println(l);
       }
	}

}
