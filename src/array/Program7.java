package array;

public class Program7 {
	// placing given number in last index of given array
	
	void placeToLastindex(int[] a,int num) {
		a[a.length-1]=num;
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4};
		Program7 p=new Program7();
		p.placeToLastindex(arr, 7);
		

	}

}
