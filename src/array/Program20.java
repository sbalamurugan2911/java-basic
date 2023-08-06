package array;

public class Program20 {
	
	// add two integer array
	
	void addTwoArray(int []a,int []b) {
		int len=a.length+b.length;
		
		int arr[]=new int[len];
		int i=0,j=0;
		while (i<len) {
			if(i<a.length) {
			arr[i]=a[i];
			
			}
			if(i>=a.length) {
			arr[i]=b[j];
			j++;
			}
			i++;
		}
		for(int ar : arr) {
		System.out.print(ar+" ");
		}
	}

	public static void main(String[] args) {
		
		int arr1[]= {1,2,3,4,5};
		int arr2[]= {6,7,8,9,10};
		
		Program20 p= new Program20();
		p.addTwoArray(arr1, arr2);
		

	}

}
