package Assignment1;

public class Problem31 {

	public static void main(String[] args) {
		// perfect number ( number = sum of divisor of that number )

		int num = 28, perfect = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				perfect += i;
			}

		}
		if (num == perfect)
			System.out.println(num + " is perfect number");
		else
			System.out.println(num + " is not perfect number");

	}

}
