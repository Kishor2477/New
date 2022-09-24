package practice;

public class StringReversewithoutReverse {

	public static void main(String[] args) {
	String str = "This is String";
	reverse1(str);
	reverse2(str);
	reverse3(str);

	}
	public static void reverse1(String str) {
		String rev = "";
		for(int i=str.length()-1;i>=0;i--) {
			rev = rev +str.charAt(i);
		}
		System.out.println(rev);
	}
	public static void reverse2(String str) {
		char[] words = str.toCharArray();
		for(int i=words.length-1;i>=0;i--) {
			System.out.print(words[i]);
		}
	}
	
	public static void reverse3(String str) {
		String[] split = str.split("");
		for(int i=split.length-1;i>=0;i--) {
			System.out.print(split[i]);
		}
	}
}
