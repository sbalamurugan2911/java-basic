package array;

import oops_concept.ArrayMovingLeft;

public class Program15 {
	void movingLeft(int a[]) {

		int firstValue = a[0];
		for (int i = 0; i < a.length - 1; i++) {
			a[i] = a[i + 1];
		}
		a[a.length - 1] = firstValue;

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 5 };

		Program15 p = new Program15();

		p.movingLeft(array);


}
}
