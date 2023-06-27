package controlFlow;

public class LargeNumber {

	public static void main(String[] args) {
		int a=5,b=3,c=9;
		if(a>b) {
			if(a>c)
				System.out.println("large number is "+a);
			else
				System.out.println("large number is "+c);
		}else if(b>c)
			System.out.println("large number is "+b);
		else
			System.out.println("large number is "+c);

	}

}
