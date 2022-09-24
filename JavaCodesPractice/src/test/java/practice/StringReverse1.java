package practice;

public class StringReverse1 {

	public static void main(String[] args) {
		String str = "This is string";
		reverse(str);

	}
	public static void reverse(String str) {
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		System.out.println(sb.reverse());
	}

}
