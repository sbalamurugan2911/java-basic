package collection;

import java.util.ArrayList;

public class CopyArraylist {
	public static void main(String[]args) {
	ArrayList a = new ArrayList();
	ArrayList b= new ArrayList();
	a.add(1);
	a.add(2);
	a.add(3);
	a.add(4);
	a.add(5);
	a.add(6);
	a.add(7);
	System.out.println("Before copying arraylist");
	System.out.println(a);
	System.out.println(b);
	b=(ArrayList) a.clone();
	System.out.println("After copying arraylist");
	System.out.println(a);
	System.out.println(b);
	
	}

	
	}

