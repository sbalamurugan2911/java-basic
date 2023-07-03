package Assignment1;

public class Problem23 {

	public static void main(String[] args) {
		// printing a number in reverse order
		int number = 123456;
		while (number > 0) {
			int remainder = (number % 10);
			System.out.print(remainder + " ");
			number /= 10;
		}

	}

}
