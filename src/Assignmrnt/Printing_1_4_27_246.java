package Assignmrnt;

public class Printing_1_4_27_246 {

	public static void main(String[] args) {
		// printing 1 4 27 246
		int ans=1;
		
		for (int i=1;i<=5;i++) {
			 
			for(int j=i;j>=1;j--) {
				ans=ans*i;
			}
				System.out.print(ans+" ");
				ans=1;
			}
		
		}

	}


