package Assignmrnt;

public class Program15 {

	public static void main(String[] args) {
		// first 20 prime number
		int num = 1;
		int prime = 0;
		while (prime < 20) {

			int divider = 0;
			for (int i = 1; i < num; i++) {

				if (num % i == 0) {
					divider++;
				}
			}
			if (divider == 1) {
				System.out.print(num + " ");
				prime++;
			}
			
			num++;
			divider = 0;

		}

	}
}
