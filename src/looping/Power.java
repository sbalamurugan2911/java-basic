package looping;

public class Power {
	public static void main(String[] args) {
		int number = 3, power = 3, result = 1;

		while (power >= 1) {
			result *= number;
			power--;

		}
		System.out.println(result);
	}

}
