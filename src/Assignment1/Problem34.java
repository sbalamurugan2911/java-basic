package Assignment1;

public class Problem34 {

	public static void main(String[] args) {
		// no of digits
		int num = 159, digit = 0;
		while (num > 0) {
			num /= 10;
			digit++;
		}
		System.out.println("digit is " + digit);
	}

}
