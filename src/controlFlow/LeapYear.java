package controlFlow;

public class LeapYear {

	public static void main(String[] args) {
		int year = 1700;
		if (year % 100 == 0) {
			if (year % 400 == 0) 
				System.out.println("give year is leap year");
			 else 
				System.out.println("give year is not leapyear");
			
		} else if (year % 4 == 0) 
			System.out.println("give year is leap year");
		 else 
			System.out.println("give year is not leap year");
		

	}

}
