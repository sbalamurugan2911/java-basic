package Assignment1;

public class Problem24 {

	public static void main(String[] args) {
		// reverse the number
		int num = 1234, reverse = 0;
		while (num > 0) {
			int remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num = num / 10;
		}

		System.out.println(reverse);
	}

}
