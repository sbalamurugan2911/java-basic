package Assignment1;

public class Problem35 {

	public static void main(String[] args) {
		// strong number (number=sum of digits factorial)
		int num = 145, sum = 0, factorial = 1, num1 = num, remainder;
		while (num > 0) {
			remainder = num % 10;
			for (int i = remainder; i > 0; i--) {
				factorial *= i;
			}
			sum += factorial;
			factorial = 1;
			num /= 10;
		}

		if (num1 == sum) {
			System.out.println(num1 + " is strong number");
		} else
			System.out.println(num1 + " is not strong number");
	}

}
