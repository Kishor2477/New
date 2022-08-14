package learnstrings;

public class StringReverse {

	public static void main(String[] args) {
		
		String s = "Selenium";
		
		int leng = s.length();
		
		String rev = "";
		
		for(int i=leng-1;i>=0;i--) {
		rev = rev +	s.charAt(i);
		}
		System.out.println(rev);

		System.out.println("==___________________++");
		
		//Using String Buffer class
		
		StringBuffer sf = new StringBuffer(s);
			StringBuffer reverse = sf.reverse();
			System.out.println(reverse);
		
	}

}
