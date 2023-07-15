package patternProgram;

public class Pattern11 {

	public static void main(String[] args) {
		/*
		  
		        1 2 3 4   
		        2     3
		        3     2
		        4 3 2 1
		*/
		int num =9;
		int number=1;
		int firstCol=2;
		int lastCol=num-1;
		
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num;j++) {
				if(i==1) {
					System.out.print(number+" ");
					number++;
				}
				if(i==num) {
					System.out.print(number-1+" ");
					number--;
				}
				if(i>1 && i<num && j==1) {
					System.out.print(firstCol+" ");
					firstCol++;
				}
				
				}
			for(int k=1;k<=num;k++) {
				if(i>1 && i<num && k>1 && k<num) {
					System.out.print(" "+" ");
				}
				
				if(i>1 && i<num && k==num) {
					System.out.print(lastCol+" ");
					lastCol--;
				}
			}
			System.out.println();
		}

	}

}
