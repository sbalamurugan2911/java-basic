package controlFlow;

public class AgeCheck {

	public static void main(String[] args) {
		int age =75;
		
		if(age>=80) {
			System.out.println("super senior");
		}else if(age>=60) {
			System.out.println("senior");
		}else if(age>=18) {
			System.out.println("major");
		}else if(age>=0) {
			System.out.println("minor");
		}else {
			System.out.println("invalid age");
		}
	

	}

}
