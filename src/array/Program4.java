package array;

public class Program4 {

	// linear search

	void linearSearch(int[] arr, int number) {
		boolean present = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == number) {
				System.out.println(number + " is present in array at index " + i);
				present = true;
				break;
			}

		}
		if (present == false) {
			System.out.println(number + " is not present in the array");
		}
	}

	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
		Program4 p = new Program4();
		p.linearSearch(a, 70);

	}

}
