package array;

public class Program13 {
	// count duplicate element in an array
	
	int count(int []a,int b) {
		int count=0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==b) {
				count++;
			}
		}
		
		return count;
	}

	public static void main(String[] args) {
		
		int a[]= {2,4,7,3,2,6,7,8,2,5,4,2,7,9,0,1};
		Program13 p=new Program13();
		int count=p.count(a, 2);
		System.out.println(count);
		

	}

}
