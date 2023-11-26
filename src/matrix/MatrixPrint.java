package matrix;

public class MatrixPrint {

	public static void main(String[] args) {
		int a[][]=new int[2][2];
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
			System.out.print(a[i][i]);
			}
			System.out.println();
		}

	}

}
