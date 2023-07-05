package Assignment1;

public class Problem37 {

	public static void main(String[] args) {
		// spy number ( sum of digits = product of digits)
		int num = 1124, sum = 0, product = 1,num1=num;
		while (num > 0) {
			sum += num % 10;
			product *= num % 10;
			num /= 10;
		}
		if (sum == product) {
			System.out.println(num1 + " is spy number");
		} else {
			System.out.println(num1 + " is not spy number");
		}
	}

}
