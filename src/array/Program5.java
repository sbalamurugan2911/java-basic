package array;

public class Program5 {

//finding index of given number in an array

	int findIndex(int[] a, int number) {
		int index = -1;

		for (int i = 0; i < a.length; i++) {
			if (a[i] == number) {
				index = i;
				break;
			}
		}
		return index;
	}

	public static void main(String[] args) {
		
		int []arr= {1,2,3,4,5,6,7,8,9};
		Program5 p=new Program5();
		int index=p.findIndex(arr, 8);
		System.out.println("Index value of given number is "+index);

	}

}
