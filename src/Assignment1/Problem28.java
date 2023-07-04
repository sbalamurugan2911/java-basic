package Assignment1;

public class Problem28 {

	public static void main(String[] args) {
		// least common multiple
		int a = 72, b =120, lcm = 0;
		for (int i = 1; i <= (a * b); i++) {
			if (i % a == 0 && i % b == 0) {
				lcm = i;
				break;
			}
		}
		System.out.println(lcm);
	}

}
