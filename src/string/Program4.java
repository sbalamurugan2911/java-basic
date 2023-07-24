package string;

public class Program4 {
	// count one character in given string
	
	int count(String word,char a) {
		int count=0;
		for(int i=0;i<word.length();i++) {
			if(word.charAt(i)==a) {
				count++;
			}
		}
		
		return count;
		
	}
	public static void main(String[]args) {
		
		
		Program4 p=new Program4();
		
		String s="payilagam";
		int count=p.count(s, 'i');
		System.out.println(count);
	}

}
