package array;

public class Program10 {
	// finding smallest element in array
	
	int smallNumber(int []a) {
		int small=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<small) {
				small=a[i];
			}
		}
		
		return small;
		
	}

	public static void main(String[] args) {
		int arr[]= {23,70,91,87,43,21,41,98};
		Program10 p=new Program10();
		int small=p.smallNumber(arr);
		System.out.println(small);
			
		}

}
