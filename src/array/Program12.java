package array;

import java.util.Arrays;

public class Program12 {
	// finding first two smallest number in array
	
		int[] firstTwoSmall(int a[]) {
		int b[]=new int [2];
		Arrays.sort(a);
		b[0]=a[0];
		b[1]=a[1];
		
		
			
			return b;
			
		}
		public static void main(String[]args) {
			
			int arr[]= {3,7,6,4,8,2};
		Program12 p=new Program12();
		int a[]=p.firstTwoSmall(arr);
		for(int b: a) {
			System.out.print(b+" ");
		}
		}
	
}
