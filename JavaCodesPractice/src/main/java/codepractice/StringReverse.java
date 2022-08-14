package codepractice;

public class StringReverse {

	public static void main(String[] args) {
		StringReverse.reverseString("selenium");
		StringReverse.reverseUsingBuffer("seleniumlea");
	}
	public static void reverseString(String str) {
		String rev = "";
		int len = str.length();
		for(int i=len-1;i>=0;i--) {
			char charAt = str.charAt(i);
			rev = rev+charAt;
		}
		System.out.println(rev);
	}
	
	public static void reverseUsingBuffer(String str) {
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
		}
	
}
