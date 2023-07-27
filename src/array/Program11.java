package array;

import java.util.Arrays;

public class Program11 {
	// finding first two biggest number in array
	
	int[] firstTwoBig(int a[]) {
	int b[]=new int [2];
	Arrays.sort(a);
	b[0]=a[a.length-1];
	b[1]=a[a.length-2];
	
	
		
		return b;
		
	}
	public static void main(String[]args) {
		
		int arr[]= {3,7,6,4,8,2};
	Program11 p=new Program11();
	int a[]=p.firstTwoBig(arr);
	for(int b: a) {
		System.out.print(b+" ");
	}
	}
}
