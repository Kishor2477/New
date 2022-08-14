package learnstrings;

public class LearnStrings {

	public static void main(String[] args) {
		String str = "Rain stoped now";
		
		//to get length of string
		
		System.out.println(str.length());
		
		//to get char at particular index
		
		System.out.println(str.charAt(3));
		
		//to get index based on value
		
		System.out.println(str.indexOf("s"));
		
		System.out.println(str.indexOf("n", str.indexOf("n")+1));

	}

}
