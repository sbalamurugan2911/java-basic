package patternProgram;

public class Pattern4 {

	public static void main(String[] args) {
	          /*
	                         *
	                       * *
	                     * * *
	                   * * * *
	           */

		int row=5;
		for(int i=row;i>=1;i--) {
			for(int j=1;j<i;j++) {
				System.out.print(" "+" ");
			}
			for(int j=row;j>=i;j--) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		
	}

}
