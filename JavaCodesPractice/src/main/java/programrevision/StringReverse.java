package programrevision;

public class StringReverse {

	public static void main(String[] args) {
		String str = "string";
		new StringReverse().learnReverse(str);
		new StringReverse().learnReverseUseingStringBufferClass(str);
	}
	public void learnReverse(String str) {
		int len = str.length();
		String rev = "";
		for(int i=len-1;i>=0;i--) {
			rev = rev+str.charAt(i);
		}
		System.out.println(rev);
	}
	
	public void learnReverseUseingStringBufferClass(String str) {
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
		
	}
}
