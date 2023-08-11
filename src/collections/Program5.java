package collections;

import java.util.ArrayList;

public class Program5 {

	public static void main(String[] args) {
		// remove element from specified index present in arraylist

		ArrayList al = new ArrayList();

		al.add(21);
		al.add(15);
		al.add(15);
		al.add(12);
		al.add(31);

		System.out.println(al);

		al.remove(2);

		System.out.println(al);

	}

}
