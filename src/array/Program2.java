package array;

public class Program2 {
	
	//printing array
	
	void printArray(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

	public static void main(String[] args) {
	
		int array[]= {1,2,3,4,5,6,7,8,9,10};
		
		Program2 p= new Program2();
		
		p.printArray(array);
		

	}

}
