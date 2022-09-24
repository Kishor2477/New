package learnfromfailures;

public class RemoveChar {

	public static void main(String[] args) {
		String str = "Char Clouda";
		char ch = 'C';
		removeChar(str, ch);

	}
	public static void removeChar(String str, char c) {
		int length = str.length();
		String rec = "";
		for(int i=0;i<length;i++) {
			if(str.charAt(i) != c) {
				 rec= rec + str.charAt(i);
			}
		
		}
		System.out.println(rec);
	}

}
