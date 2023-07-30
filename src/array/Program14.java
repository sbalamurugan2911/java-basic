package array;

public class Program14 {
	// addition of odd index number in given array
	
	int addition(int a[]) {
		int add=0;
		for(int i=0;i<a.length;i++) {
			if (i%2!=0) {
				add+=a[i];
			}
		}
		return add;
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9};
		Program14 p=new Program14();
		int num=p.addition(arr);
		System.out.println(num);
	}

}
