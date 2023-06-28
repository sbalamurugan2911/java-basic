package controlFlow;

public class Day1 {

	public static void main(String[] args) {
		// using switch case
		// try without using break keyword

		int a = 4;
		String day;
		switch (a) {
		case 6:
		case 7:
			day = "weekly off";
			break;
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			day = "working day";
			break;
		default:
			day = "invalid day";

		}

		System.out.println(day);
	}

}
