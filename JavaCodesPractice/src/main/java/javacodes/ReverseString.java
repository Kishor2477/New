package javacodes;

import org.omg.CORBA.PUBLIC_MEMBER;

public class ReverseString {
	String data = "This needs to printed Back";
	public static void main(String[] args) {
	//String data = "This needs to printed Back";
		ReverseString reverseString = new ReverseString();
		reverseString.usingStringBuilder();
		reverseString.usingArray();
	}
	
	public void usingStringBuilder() {
		// TODO Auto-generated method stub

//Using StringBuilder
StringBuilder stringBuilder = new StringBuilder(data);
System.out.println(stringBuilder.reverse());
	}
	
//Using Array
public void usingArray() {
char[] charArray = data.toCharArray();
int length = charArray.length;
for(int i = length-1;i >= 0; i--) {
	System.out.print(charArray[i]);
}
	} 

}
