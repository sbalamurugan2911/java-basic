package Assignment1;

public class Problem38 {

	public static void main(String[] args) {
		// prime nos in fibonocci series
		int n = 1;
		int first_number = -1, second_number = 1,divider=0, third_number;
		while (n <= 20) {
			third_number = first_number + second_number;
			for(int i=1;i<third_number;i++) {
				
				 if(third_number%i==0) {
					divider++;
				}
			} if(divider==1) {
			System.out.print(third_number + " ");
			}
			divider=0;
			first_number = second_number;
			second_number = third_number;
			n++;
		}

	}

}
