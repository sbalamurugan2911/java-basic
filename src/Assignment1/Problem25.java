package Assignment1;

public class Problem25 {

	public static void main(String[] args) {
		//palindrom
		int num = 12321, reverse = 0,beforeReverse=num;
		
		while (num > 0) {
			int remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num = num / 10;
		}
		if(beforeReverse==reverse)
			System.out.println("palindrom number");
		else
			System.out.println("not palindrom");
	}

}
