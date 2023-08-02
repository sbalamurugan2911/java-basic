package array;

public class Program19 {
	// copying given array in reverse order
	
	int[] copyReverseArray(int a[]) {
		int b[]=new int [a.length];
		int i=a.length-1;
		int j=0;
		while(i>=0){
			
			b[i]=a[j];
			i--;
			j++;
		}
		
		
		return b;
	}

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6,7,8,9};
		
		Program19 p = new Program19();
		int [] a=p.copyReverseArray(arr);
		
		for(int b: a) {
			System.out.print(b+" ");
		}

	}

}
