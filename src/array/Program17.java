package array;

public class Program17 {
	// moving array element twise towards left
	void movingLeftTwise(int a[]) {
for(int j=0;j<2;j++) {
		int firstValue = a[0];
		for (int i = 0; i < a.length - 1; i++) {
			a[i] = a[i + 1];
		}
		a[a.length - 1] = firstValue;
}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 5 };

		Program17 p = new Program17();

		p.movingLeftTwise(array);


	}

}
