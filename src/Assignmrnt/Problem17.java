package Assignmrnt;

public class Problem17 {

	public static void main(String[] args) {
		// factorial
		int n = 5, factorial = 1;
		for (int i = n; i >= 1; i--) {
			factorial *= i;
		}
		System.out.println(factorial);
	}

}
