package Assignment1;

public class Problem21 {

	public static void main(String[] args) {
		// fibonacci series
		int n = 1;
		int first_number = -1, second_number = 1, third_number;
		while (n <= 10) {
			third_number = first_number + second_number;
			System.out.print(third_number + " ");
			first_number = second_number;
			second_number = third_number;
			n++;
		}

	}

}
