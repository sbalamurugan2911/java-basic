package patternProgram;

public class Pattern3 {

	public static void main(String[] args) {
		/*
		      * 
		      * * 
		      * * *
		      * * * *
		 */

		for (int i = 1; i < 5; i++) {
			for (int j = i; j > 0; j--) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}

	}

}
