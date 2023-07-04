package Assignment1;

public class Problem26 {

	public static void main(String[] args) {
		// smallest divisor of integer
		int num = 50;
		int i = 2;
		while (i <= num / 2) {
			if (num % i == 0) {
				System.out.println(i);
				break;
			}
			i++;
		}

	}

}
