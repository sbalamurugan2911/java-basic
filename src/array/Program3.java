package array;

public class Program3 {
	// printing array in reverse order
	
	void reverseArray(int a[]) {
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		}
	}

	public static void main(String[] args) {
		
		int array []= {1,2,3,4,5,6,7,8,9,10};
		
		Program3 p = new Program3();
		
		p.reverseArray(array);
		
		

	}

}
