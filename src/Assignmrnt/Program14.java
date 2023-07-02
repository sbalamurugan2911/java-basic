package Assignmrnt;
public class Program14 {

	public static void main(String[] args) {
		// check prime no
		int num = 15;
		int divider=0;
		for(int i=1;i<num;i++) {
			
			 if(num%i==0) {
				divider++;
			}
		}
		if(divider>1||divider<1)
			System.out.println("not prime number");
		else
			System.out.println("prime number");

	}

}
