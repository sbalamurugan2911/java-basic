package array;

public class Program18 {
	// moving array element towards right by twice
	
	void movingRightTwice(int a[]) {
for(int j=1;j<=2;j++) {
		int lastValue = a[a.length-1];
		for (int i = a.length-1; i >0; i--) {
			a[i] = a[i - 1];
		}
		a[0] = lastValue;
}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 5 };

		Program18 p = new Program18();

		p.movingRightTwice(array);


}}
