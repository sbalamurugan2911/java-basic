package Assignment1;

public class Problem29 {

	public static void main(String[] args) {
		// decimal to binary
		int num = 8,binary=0,i=1;
		while(num>0) {
			int remainder=num%2;
			binary+=remainder*i;
			i*=10;
			num=num/2;
		}
System.out.println(binary);
	}

}
