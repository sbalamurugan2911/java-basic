package Assignment1;

public class Problem33 {

	public static void main(String[] args) {
		// check number multiple of three without using / and %

		int num = 11;
		boolean check = false;
		for (int i = 1; i < num; i++) {
			if (num == i * 3) {
				check = true;
			}
		}
		if (check)
			System.out.println(num + " is multiple of 3");
		else
			System.out.println(num + " is not multiple of 3");
	}

}
