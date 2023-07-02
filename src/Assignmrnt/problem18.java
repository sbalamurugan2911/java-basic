package Assignmrnt;

public class problem18 {

	public static void main(String[] args) {
		// 5! 4! 3! 2! 1!
		int factorial=1;
		for(int n=5;n>=1;n--) {
			for (int i = n; i >= 1; i--) {
				factorial *= i;
			}
			System.out.print(factorial+" ");
			factorial=1;
		}

	}

}
