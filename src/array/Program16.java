package array;

public class Program16 {
	void movingRight(int a[]) {

		int lastValue = a[a.length-1];
		for (int i = a.length-1; i >0; i--) {
			a[i] = a[i - 1];
		}
		a[0] = lastValue;

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 5 };

		Program16 p = new Program16();

		p.movingRight(array);


}
}
