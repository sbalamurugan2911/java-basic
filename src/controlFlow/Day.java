package controlFlow;

public class Day {

	public static void main(String[] args) {
		int a = 7;
		String day;
		switch (a) {
		case 1:
			day = "Monday";
			break;
		case 2:
			day = "Tuesday";
			break;
		case 3:
			day = "Wednesday";
			break;
		case 4:
			day = "Thursday";
			break;
		case 5:
			day = "friday";
			break;
		case 6:
			day = "Saturday";
			break;
		case 7:
			day = "Sunday";
			break;
		default:
			day="Invalid day";

		}
System.out.println(day);
	}

}
