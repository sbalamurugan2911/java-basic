package Assignment1;

public class Problem22 {

	public static void main(String[] args) {
		// fibanocci series using two variable
		int first = -1, second = 1;
		for (int i = 1; i <= 10; i++) {
			System.out.print((first + second)+" ");

			second = first + second;
			first = second - first;
		}

	}

}
