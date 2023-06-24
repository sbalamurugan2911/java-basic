package javaProgram;

public class Swapping_wittout_new_variable {

	public static void main(String[] args) {
         int a=-2,b=0,c=10;
		
		System.out.println("Before Swapping");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		a=a+b+c;
		c=a-(b+c);
		b=a-(b+c);
		a=a-(b+c);
		System.out.println("After Swapping");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}

}
