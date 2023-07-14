package array;

public class Program6 {
	// removing given number from an array
	
	boolean removeNumber(int []a,int num) {
		boolean remove=false;
		for(int i=0;i<a.length;i++) {
			if(a[i]==num) {
				a[i]=0;
				remove=true;
				break;
			}
		}
		
		return remove;
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9};
		Program6 p=new Program6();
		
		boolean result=p.removeNumber(arr, 6);
		
	
		System.out.println(result);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
