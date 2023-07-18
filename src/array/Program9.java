package array;

public class Program9 {
	// finding biggest number in array
	
	int bigNumber(int []a) {
		int big=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>big) {
				big=a[i];
			}
		}
		
		return big;
		
	}

	public static void main(String[] args) {
		int arr[]= {41,70,91,87,43,23,41,98};
		Program9 p=new Program9();
		int biggest=p.bigNumber(arr);
		System.out.println(biggest);
			
		}
		

	}


