package array;

public class Program21 {

	public static void main(String[] args) {
		// Printing only negative number in an array
		
		int a[]= {1,3,5,6,-4,3,-2,9};
		
		for ( int i=0; i<a.length;i++){
			
			if(a[i]<0) {
				System.out.print(a[i]+" ");
			}
			
		}

	}

}
