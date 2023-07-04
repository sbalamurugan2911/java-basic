package Assignment1;

public class Problem27 {

	public static void main(String[] args) {
		// greatest common divisor
		int a = 72, b = 153, gcd=1;
		for (int i = 2; i <=a && i<=b; i++) {
			if (a % i == 0 && b % i == 0) {
				gcd = i;
			}
		}
		System.out.println(gcd);
	}

}
