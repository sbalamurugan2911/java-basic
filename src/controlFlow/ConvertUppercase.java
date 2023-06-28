package controlFlow;

public class ConvertUppercase {

	public static void main(String[] args) {
		char letter = 'q',Uppercase;

		int ascii = letter, Upper;

		if (ascii > 96 && ascii < 123) {
			Upper = ascii - 32;
			Uppercase=(char) Upper;
			System.out.println(Uppercase);
		} else if (ascii > 64 && ascii < 91) {

			Upper = ascii;
			Uppercase=(char) Upper;
			System.out.println(Uppercase);
		} else
			System.out.println("invalid character");

	}

}
