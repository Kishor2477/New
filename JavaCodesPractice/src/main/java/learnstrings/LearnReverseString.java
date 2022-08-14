package learnstrings;

public class LearnReverseString {

	public static void main(String[] args) {
		String s = "Selenium";
		int length = s.length();
		String rev = "";
		for(int i=length-1;i>=0;i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
		
		StringBuilder sb = new StringBuilder(s);
		System.out.println(sb.reverse());

	}

}
