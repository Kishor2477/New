package practice;

public class StringReverse {
	String s = "selenium";
	public static void main(String[] args) {
		String s = "selenium";
		int length = s.length();
		String rev = "";
		for(int i=length-1;i>=0;i--) {
			rev = rev + s.charAt(i);
		}
System.out.println(rev);
	}
	
public void stringBuffer() {
	
	StringBuffer sb = new StringBuffer(s);
	System.out.println(sb.reverse());
}
}
