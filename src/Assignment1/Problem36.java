package Assignment1;

public class Problem36 {

	public static void main(String[] args) {
		// neon number(number=sum of digits of its square)
		int num = 9;
		int square = num * num, sum = 0;
		while (square > 0) {
			sum += square % 10;
			square /= 10;
		}
		if (num == sum) {
			System.out.println(num + " is neon number");

		} else
			System.out.println(num + " is not neon number");
	}

}
