package array;

public class Program8 {
	// how many times given number present in array
	
	void counting(int []a,int num) {
		int count=0;
		for (int i=0;i<a.length;i++) {
			if(a[i]==num) {
				count++;
			}
			
		}
		System.out.print(count);
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,1,9,5,6,1,5,3,1,4,3,6,1,8};
		Program8 p =new Program8();
		p.counting(arr,3);

	}

}
