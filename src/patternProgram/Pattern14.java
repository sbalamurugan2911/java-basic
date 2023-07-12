package patternProgram;

public class Pattern14 {

	public static void main(String[] args) {
		/*  
		  1
		  3 5
		  7 9 11
		  13 15 17 19
		  
		  
		*/
		
		int num = 1;
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(num + " ");
				num+=2;
			}
			System.out.println();

	}

	}
}
