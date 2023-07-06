package Assignment1;

public class Problem32 {

	public static void main(String[] args) {
		// check given number is armstrong number
		int num = 8208, digits = 0, num1 = num, sum = 0, remainder = 0, power = 1;
		for (int i = num; num > 0; num /= 10) {
			digits++;
		}
		int digit1 = digits;
		num = num1;
		while (num > 0) {
			remainder = num % 10;
			for (int j = digits; j > 0; j--) {
				power *= remainder;
			}
			sum += power;
			power = 1;
			digits = digit1;
			num /= 10;
		}

		if (num1 == sum) {
			System.out.println(num1 + " is armstrong number");
		} else
			System.out.println(num1 + " is not armstrong number");
	}

}
