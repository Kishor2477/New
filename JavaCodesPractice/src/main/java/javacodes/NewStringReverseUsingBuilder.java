package javacodes;

public class NewStringReverseUsingBuilder {

	public static void main(String[] args) {
		String data = "I'M good at programing";
		
		StringBuilder builder = new StringBuilder(data);
		System.out.println(builder.reverse());

		for(int i = data.length()-1 ; i>=0 ; i--) {
			System.out.print(data.charAt(i));
		}
	}

}
